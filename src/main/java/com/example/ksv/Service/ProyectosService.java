
package com.example.ksv.Service;

import com.example.ksv.Interface.IProyectosService;
import com.example.ksv.Model.Proyectos;
import com.example.ksv.Repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {
    @Autowired ProyectosRepository proyectosRepo;

    @Override
    public List<Proyectos> verProyectos() {
       List<Proyectos>pro = proyectosRepo.findAll();
       return pro;
    }

    @Override
    public void crearProyectos(Proyectos pro) {
       proyectosRepo.save(pro);
    }

    @Override
    public void borrarProyectos(Long id) {
       proyectosRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyectos(Long id) {
     Proyectos pro = proyectosRepo.findById(id).orElse(null);
     return pro;
    }
    
}
