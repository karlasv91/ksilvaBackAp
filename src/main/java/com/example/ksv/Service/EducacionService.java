
package com.example.ksv.Service;

import com.example.ksv.Interface.IEducacionService;
import com.example.ksv.Model.Educacion;
import com.example.ksv.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    @Autowired EducacionRepository educacionRepo;

    @Override
    public List<Educacion> verEducacion() {
       List<Educacion> edu = educacionRepo.findAll();
       return edu;
    }

    @Override
    public void crearEducacion(Educacion edu) {
       educacionRepo.save(edu);
    }

    @Override
    public void borrarEducacion(Long id) {
       educacionRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
       Educacion edu = educacionRepo.findById(id).orElse(null);
       return edu;
    }
    
}
