
package com.example.ksv.Service;

import com.example.ksv.Interface.IPersonaService;
import com.example.ksv.Model.Persona;
import com.example.ksv.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    @Autowired PersonaRepository personaRepo;

    @Override
    public List<Persona> verPersonas() {
        List<Persona>per= personaRepo.findAll();
        return per;
                
    }

    @Override
    public void crearPersona(Persona per) {
        personaRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
       personaRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
       Persona per = personaRepo.findById(id).orElse(null);
       return per;
    }
    
}
