
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
  @Table (name="educacion")
public class Educacion {
    
    @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    
    private Integer id;
    private String nombreInstitucion;
    private String logoInstitucion;
    private String titulo;
    private String fechaInicio;
    private String fechaFin;    
    private boolean esEstudioActual;
    
    @Column(name="persona_id")
    private Long personaId;

    public Educacion() {
    }
     //gdfgfd
    public Educacion(Integer id, String nombreInstitucion, String logoInstitucion, String titulo, String fechaInicio, String fechaFin, boolean esEstudioActual, Long personaId) {
       //dfdsfsdf
        this.id = id;
        this.nombreInstitucion = nombreInstitucion;
        this.logoInstitucion = logoInstitucion;
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.esEstudioActual = esEstudioActual;
        this.personaId = personaId;
    }

  
    
}
