
package com.example.ksv.Controller;

import com.example.ksv.Interface.IPersonaService;
import com.example.ksv.Model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired IPersonaService iPersonaServ;
    
    @GetMapping("/persona/traer")
    @ResponseBody
    public List <Persona> verPersona(){
        return iPersonaServ.verPersonas();
    }
    
    @PostMapping("/persona/crear")
    public void crearPersona(@RequestBody Persona per){
        iPersonaServ.crearPersona(per); 
    }
    
    @GetMapping("/persona/buscar/{id}")
    @ResponseBody
    public Persona buscarPersona(@PathVariable Long id){
        return iPersonaServ.buscarPersona(id); 
    }
    
    
    @DeleteMapping("/persona/borrar/{id}")
    public void borrarPersona(@PathVariable Long id){
        iPersonaServ.borrarPersona(id);
    }
    
    @PutMapping("/persona/editar/{id}")
    public Persona editarPersona(@PathVariable Long id, @RequestBody Persona persona){
        Persona per= iPersonaServ.buscarPersona(id);
        
        per.setNombre(persona.getNombre());
        per.setApellido(persona.getApellido());
        per.setProfesion(persona.getProfesion());
        
        iPersonaServ.crearPersona(per);
        return per;
    }
}
