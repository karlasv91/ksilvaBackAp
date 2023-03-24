
package com.example.ksv.Service;

import com.example.ksv.Interface.IExperienciaService;
import com.example.ksv.Model.Experiencia;
import com.example.ksv.Repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {
    @Autowired ExperienciaRepository experienciaRepo;

    @Override
    public List<Experiencia> verExperiencias() {
       List<Experiencia> experiencias= experienciaRepo.findAll();
       return experiencias;
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
      experienciaRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
       experienciaRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
       Experiencia experiencias= experienciaRepo.findById(id).orElse(null);
       return experiencias;
    }
    
}
