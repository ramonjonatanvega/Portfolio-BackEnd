
package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Persona;
import java.util.List;


public interface IPersonaService {
    //traer persona
     public List<Persona> list();
    
    //guardar objeto persona
    public void savePersona(Persona perso);
    
    public void delete(Long id);
    public Persona findPersona(Long id);
    
    //login
    public PersonaDTO loginPersona(String correo, String contrasenia);
    public Persona getOne(Long id);
    public void edit(Persona pers);
}
