
package com.example.ksv.Controller;

import com.example.ksv.Interface.IHardAndSoftService;
import com.example.ksv.Model.HardAndSoft;
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
public class HardAndSoftController {
    @Autowired IHardAndSoftService iHardAndSoftServ;
    
    @GetMapping("/hardAndSoft/traer")
    @ResponseBody
     public List<HardAndSoft>verHardAndSoft(){
         return iHardAndSoftServ.verHardAndSoft();
     }
     
     @PostMapping("/hardAndSoft/crear")
      public void crearHardAndSoft(@RequestBody HardAndSoft hys){
          iHardAndSoftServ.crearHardAndSoft(hys);
      }
      
      @DeleteMapping("/hardAndSoft/borrar/{id}")
      public void borrarHardAndSoft(@PathVariable Long id){
          iHardAndSoftServ.borrarHardAndSoft(id);     
      }
      
      @GetMapping("/hardAndSoft/buscar/{id}")
      @ResponseBody
      public HardAndSoft buscarHardAndSoft(@PathVariable Long id){
          return iHardAndSoftServ.buscarHardAndSoft(id);    
      }
      
       @PutMapping("/hardAndSoft/editar/{id}")
      public HardAndSoft editarHYS(@PathVariable Long id, @RequestBody HardAndSoft hardAndSoft){
          HardAndSoft hys = iHardAndSoftServ.buscarHardAndSoft(id);
          
          hys.setHerramienta(hardAndSoft.getHerramienta());
          hys.setNivel(hardAndSoft.getNivel());
         
          
          iHardAndSoftServ.crearHardAndSoft(hys);
          return hys;
      }
          
      }
    

