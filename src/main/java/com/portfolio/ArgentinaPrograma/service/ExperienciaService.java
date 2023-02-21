
package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Experiencia;
import com.portfolio.ArgentinaPrograma.repository.IExperiencia;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExperienciaService implements IExperienciaService{
    @Autowired
    private IExperiencia expRepository;
 

    @Override
      public List<Experiencia> list(){
        return expRepository.findAll();
    }

    @Override  //crear o modificar experiencia
    public void saveExperiencia(Experiencia exper) {
     expRepository.save(exper);
    }

    @Override
     public Experiencia getOne(int id){
        Experiencia exper = expRepository.findById(id).orElse(null);
        return exper;
    }
     
    //elimina experiencia por id
    @Override
        public void delete(Integer id) {
       expRepository.deleteById(id);
    }
        
    @Override
         public void edit(Experiencia expe){
        expRepository.save(expe);
    }

    @Override //traer la experiencia
    public Experiencia findExperiencia(Integer id) {
      Experiencia exper=expRepository.findById(id).orElse(null);
       return exper;
    }

     //busca lista de relojes por la id de la persona
    @Override
    public List<Experiencia> findByPersonaId(Long personaId) {
        return expRepository.findByPersonaId(personaId);
    }
    
   
    @Override
      public Optional<Experiencia> gettwo(int id){
         return expRepository.findById(id);
     }
     
}
