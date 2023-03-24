
package com.example.ksv.Interface;

import com.example.ksv.Model.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona>verPersonas();
    public void crearPersona(Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
}
