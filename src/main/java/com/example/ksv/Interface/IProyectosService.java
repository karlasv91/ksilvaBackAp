
package com.example.ksv.Interface;

import com.example.ksv.Model.Proyectos;
import java.util.List;


public interface IProyectosService {
    public List<Proyectos>verProyectos();
    public void crearProyectos(Proyectos pro);
    public void borrarProyectos(Long id);
    public Proyectos buscarProyectos(Long id);
 
}
