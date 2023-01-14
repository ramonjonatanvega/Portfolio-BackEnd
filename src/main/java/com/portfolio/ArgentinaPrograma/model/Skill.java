
package com.portfolio.ArgentinaPrograma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name="skill")
public class Skill {
    
     @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    //sgsg
     private Integer id;
    private String nombreHabilidad;
    private String porcentaje;

    @Column(name="persona_id")
    private Long personaId;
    
    public Skill() {
    }
//sgsgs
    public Skill(Integer id, String nombreHabilidad, String porcentaje, Long personaId) {
       //sfsdf
       this.id = id;
        this.nombreHabilidad = nombreHabilidad;
        this.porcentaje = porcentaje;
        this.personaId = personaId;
    }
    
}
