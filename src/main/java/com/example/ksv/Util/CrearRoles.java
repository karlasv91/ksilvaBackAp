
package com.example.ksv.Util;

import com.example.ksv.Security.Entity.Rol;
import com.example.ksv.Security.Enums.RolNombre;
import com.example.ksv.Security.Service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component 
public class CrearRoles implements CommandLineRunner{
   
    @Autowired
    RolService rolService;
    
    @Override
    public void run(String... args) throws Exception {
        /*Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
        Rol rolUser = new Rol(RolNombre.ROLE_USER);
        
        rolService.save(rolAdmin);
        rolService.save(rolUser);*/
    }
    
}
