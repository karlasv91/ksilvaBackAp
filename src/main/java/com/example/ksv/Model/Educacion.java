
package com.example.ksv.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private String fundacion;
    private String periodo;
    private String resena;

    public Educacion() {
    }

    public Educacion(Long id, String fundacion, String periodo, String resena) {
        this.id = id;
        this.fundacion = fundacion;
        this.periodo = periodo;
        this.resena = resena;
    }
     
}
