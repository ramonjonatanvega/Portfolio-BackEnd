
package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Educacion;
import java.util.List;


public interface IEducacionService {
     public List<Educacion> list();
    public void saveEducacion(Educacion edu);
    public Educacion getOne(int id);
    public void delete(Integer id);
    public Educacion findEducacion(Integer id);
    public List<Educacion> findByPersonaId(Long personaId);
    public void edit(Educacion edu);
    
}
