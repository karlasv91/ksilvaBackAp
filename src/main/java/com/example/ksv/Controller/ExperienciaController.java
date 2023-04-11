
package com.example.ksv.Controller;

import com.example.ksv.Interface.IExperienciaService;
import com.example.ksv.Model.Experiencia;
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
public class ExperienciaController {
    @Autowired IExperienciaService iExperienciaServ;
    
    @GetMapping("/experiencia/traer")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return iExperienciaServ.verExperiencias();
    }
    
    @PostMapping("/experiencia/crear")
    public void crearExperiencia (@RequestBody Experiencia exp){
        iExperienciaServ.crearExperiencia(exp); 
    }
    
    @DeleteMapping("/experiencia/borrar/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        iExperienciaServ.borrarExperiencia(id);    
    }
    
    @GetMapping("/experiencia/buscar/{id}")
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable Long id){
        return iExperienciaServ.buscarExperiencia(id);
    }
    
    
    @PutMapping("/experiencia/editar/{id}")
    public Experiencia editarExperiencia(@PathVariable Long id, @RequestBody Experiencia experiencia){
        Experiencia exp= iExperienciaServ.buscarExperiencia(id);
        
        exp.setEmpresa(experiencia.getEmpresa());
        exp.setFecha(experiencia.getFecha());
        exp.setDetalle(experiencia.getDetalle());
        
        iExperienciaServ.crearExperiencia(exp);
        return exp;
    }
            
    
}
