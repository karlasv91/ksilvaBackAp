
package com.example.ksv.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private String  empresa;
    private String fecha;
    private String detalle;

    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String fecha, String detalle) {
        this.id = id;
        this.empresa = empresa;
        this.fecha = fecha;
        this.detalle = detalle;
    }
    
    
    
}
