
package com.example.ksv.Controller;

import com.example.ksv.Interface.IProyectosService;
import com.example.ksv.Model.Proyectos;
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
public class ProyectosController {
    @Autowired IProyectosService iProyectosServ;
    
    @GetMapping("/proyectos/traer")
    @ResponseBody
    public List<Proyectos>verProyectos(){
        return iProyectosServ.verProyectos();
    }
    
    @PostMapping("/proyectos/crear")
     public void crearProyectos(@RequestBody Proyectos pro){
         iProyectosServ.crearProyectos(pro);   
     }
     
      @DeleteMapping("/proyectos/borrar/{id}")
      public void borrarProyectos(@PathVariable Long id){
          iProyectosServ.borrarProyectos(id);    
      }
      
      @GetMapping("/proyectos/buscar/{id}")
      @ResponseBody
       public Proyectos buscarProyectos(@PathVariable Long id){
           return iProyectosServ.buscarProyectos(id);
       }
       
       @PutMapping("/proyectos/editar/{id}")
       public Proyectos editarProyecto(@PathVariable Long id, @RequestBody Proyectos proyectos){
           Proyectos pro = iProyectosServ.buscarProyectos(id);
           
           pro.setTitulo(proyectos.getTitulo());
           pro.setTexto(proyectos.getTexto());
           
           iProyectosServ.crearProyectos(pro);
           return pro;            
       }
}
