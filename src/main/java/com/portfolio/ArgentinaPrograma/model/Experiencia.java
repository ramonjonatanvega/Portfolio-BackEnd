
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
@Table (name="experiencia")
public class Experiencia {
   
     @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
   
     private Integer id;
    private String nombreEmpresa;
    private String logoEmpresa;
    private String puesto;
    private String descripcion;
    private String fechaInicio;
    private String fechaFin;      
    private boolean esTrabajoActual;
    
    @Column(name="persona_id")
    private Long personaId;

    public Experiencia() {
    }
//dfgddh
    public Experiencia(Integer id, String nombreEmpresa, String logoEmpresa, String puesto, String descripcion, String fechaInicio, String fechaFin, boolean esTrabajoActual, Long personaId) {
       //sdfsdfs
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.logoEmpresa = logoEmpresa;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.esTrabajoActual = esTrabajoActual;
        this.personaId = personaId;
    }

   

 
    
}
