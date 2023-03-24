
package com.example.ksv.Interface;

import com.example.ksv.Model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List<Experiencia>verExperiencias();
    public void crearExperiencia (Experiencia exp);
    public void borrarExperiencia(Long id);
    public Experiencia buscarExperiencia(Long id);
    
           
    
    
}
