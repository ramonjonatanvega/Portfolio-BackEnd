
package com.portfolio.ArgentinaPrograma.service;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersonaDTO {
  private Long id;
    private String nombre;
    private String apellido;
    private String banner;
    private String foto_perfil;
    private String titulo;
    private String ubicacion;
    private String acerca_de;

    public PersonaDTO() {
    }

    public PersonaDTO(Long id, String nombre, String apellido, String banner, String foto_perfil, String titulo, String ubicacion, String acerca_de) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.banner = banner;
        this.foto_perfil = foto_perfil;
        this.titulo = titulo;
        this.ubicacion = ubicacion;
        this.acerca_de = acerca_de;
    }

   
    
}
    

