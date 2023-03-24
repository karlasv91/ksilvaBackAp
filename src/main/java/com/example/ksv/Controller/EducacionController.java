
package com.example.ksv.Controller;

import com.example.ksv.Interface.IEducacionService;
import com.example.ksv.Model.Educacion;
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
public class EducacionController {
    @Autowired IEducacionService iEducacionServ;
    
    @GetMapping("/educacion/traer")
    @ResponseBody
     public List<Educacion>verEducacion(){
         return iEducacionServ.verEducacion();   
     }
     
     @PostMapping("educacion/crear")
      public void crearEducacion(@RequestBody Educacion edu){
          iEducacionServ.crearEducacion(edu);
      }
      
      @DeleteMapping("educacion/borrar/{id}")
       public void borrarEducacion(@PathVariable Long id){
           iEducacionServ.borrarEducacion(id);
       }
       
       @GetMapping("/educacion/buscar/{id}")
       @ResponseBody 
        public Educacion buscarEducacion(@PathVariable Long id){
            return iEducacionServ.buscarEducacion(id);
        }
        
         @PutMapping("/educacion/editar/{id}")
        public Educacion editarEducacion(@PathVariable Long id, @RequestBody Educacion educacion){
            Educacion edu = iEducacionServ.buscarEducacion(id);
            
            edu.setFundacion(educacion.getFundacion());
            edu.setPeriodo(educacion.getPeriodo());
            edu.setResena(educacion.getResena());
            
            iEducacionServ.crearEducacion(edu);
            return edu;
        }
    
}
