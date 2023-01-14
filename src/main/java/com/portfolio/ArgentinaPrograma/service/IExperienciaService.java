
package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List<Experiencia> list();
    public void saveExperiencia(Experiencia exper);
    public Experiencia getOne(int id);
    public void delete(Integer id);
    public Experiencia findExperiencia(Integer id);
    
    public List<Experiencia> findByPersonaId(Long personaId);
   
   
    
}
