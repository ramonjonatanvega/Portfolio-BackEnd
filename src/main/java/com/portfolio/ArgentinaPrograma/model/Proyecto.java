
package com.portfolio.ArgentinaPrograma.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    //ddfgdf
    private Integer id;
    private String nombre;
    private String imagen;
    private String fecha;  
    private String descripcion;
    private String url;

    @Column(name="persona_id")
    private Long personaId;
    
    
    
    public Proyecto() {
    }
//fgfdgfd
    public Proyecto(Integer id, String nombre, String imagen, String fecha, String descripcion, String url, Long personaId) {
       //dgdsg
       this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.fecha = fecha;      
        this.descripcion = descripcion;
        this.url = url;
        this.personaId = personaId;
    }
    
    //declarar getter y setter para la imagen
  
    
    
}
