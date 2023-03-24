
package com.example.ksv.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Proyectos {
    
   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private Long id;
     
    private String titulo;
    private String texto;

    public Proyectos() {
    }

    public Proyectos(Long id, String titulo, String texto) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
    }
            
}
