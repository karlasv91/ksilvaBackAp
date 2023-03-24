
package com.example.ksv.Interface;

import com.example.ksv.Model.Educacion;
import java.util.List;


public interface IEducacionService {
    public List<Educacion>verEducacion();
    public void crearEducacion(Educacion edu);
    public void borrarEducacion(Long id);
    public Educacion buscarEducacion(Long id);
    
}
