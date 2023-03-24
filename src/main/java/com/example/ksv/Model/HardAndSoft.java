
package com.example.ksv.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class HardAndSoft {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    
    private String herramienta;
    private int nivel;

    public HardAndSoft() {
    }

    public HardAndSoft(Long id, String herramienta, int nivel) {
        this.id = id;
        this.herramienta = herramienta;
        this.nivel = nivel;
    }
    
    
  
    
}
