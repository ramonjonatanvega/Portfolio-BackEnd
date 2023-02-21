
package com.portfolio.ArgentinaPrograma.model;

import com.sun.istack.NotNull;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name="persona")
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
     @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String apellido;
     
     
    @Size(min = 1, max = 400, message = "no cumple con la longitud")
    private String banner;
    
    @Size(min = 1, max = 400, message = "no cumple con la longitud")
    private String banner1;
    
    @Size(min = 1, max = 400, message = "no cumple con la longitud")
    private String banner2;
    
    @Size(min = 1, max = 400, message = "no cumple con la longitud")
    private String banner3;
    
    @Size(min = 1, max = 400, message = "no cumple con la longitud")
    private String foto_perfil;
    
     @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String titulo;
   
     @NotNull
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String ubicacion;
     
      @NotNull
    @Size(min = 1, max = 200, message = "no cumple con la longitud")
    private String acerca_de;
     
     @Size(min = 1, max = 400, message = "no cumple con la longitud")  
    private String correo;
    
    private String contrasenia;

    @OneToMany(mappedBy="personaId")
    private List<Experiencia> experiencia;
    @OneToMany(mappedBy="personaId")
    private List<Proyecto> proyecto;
    @OneToMany(mappedBy="personaId")
    private List<Skill> skills;
    @OneToMany(mappedBy="personaId")
    private List<Educacion> educacion;
    
    
    public Persona() {
    }
//gsdfgfdg
    public Persona(Long id, String nombre, String apellido, String banner, String banner1, String banner2, String banner3, String foto_perfil, String titulo, String ubicacion, String acerca_de, String correo, String contrasenia, List<Experiencia> experiencia, List<Proyecto> proyecto, List<Skill> skills, List<Educacion> educacion) {
       //dgdsg
       this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.banner = banner;
        this.banner1 = banner1;
        this.banner2 = banner2;
        this.banner3 = banner3;
        this.foto_perfil = foto_perfil;
        this.titulo = titulo;
        this.ubicacion = ubicacion;
        this.acerca_de = acerca_de;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.experiencia = experiencia;
        this.proyecto = proyecto;
        this.skills = skills;
        this.educacion = educacion;
        
        experiencia = new ArrayList();
        proyecto = new ArrayList();
        skills = new ArrayList();
        educacion = new ArrayList();
    }

    
}
