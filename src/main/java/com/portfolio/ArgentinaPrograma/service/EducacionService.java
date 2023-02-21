
package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Educacion;
import com.portfolio.ArgentinaPrograma.repository.IEducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacionService{
     @Autowired
    private IEducacion eduRepository;
     @Override
      public List<Educacion> list(){
        return eduRepository.findAll();
    }

   

    @Override //crear o modificar educacion
    public void saveEducacion(Educacion edu) {
        eduRepository.save(edu);
    }

     @Override
     public Educacion getOne(int id){
        Educacion expe = eduRepository.findById(id).orElse(null);
        return expe;
    }
    
    @Override // borrar educacion
    public void delete(Integer id) {
       eduRepository.deleteById(id);
    }
    
     @Override
     public void edit(Educacion edu){
        eduRepository.save(edu);
    }

    @Override //traer la educacion
    public Educacion findEducacion(Integer id) {
         Educacion edu=eduRepository.findById(id).orElse(null);
       return edu;
    }
     
    
      //busca lista de relojes por la id de la persona
     @Override
    public List<Educacion> findByPersonaId(Long personaId) {
        return eduRepository.findByPersonaId(personaId);
    }
    
}
