
package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Skill;
import com.portfolio.ArgentinaPrograma.repository.ISkill;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional//persistencia en base de datos
public class SkillService implements ISkillService{

     @Autowired
    private ISkill skillRepository;
    
    
     
    @Override //ver lista de skills
    public List<Skill> list() {
        return skillRepository.findAll();
    }

     @Override
    public Skill getOne(int id){
       Skill habilidad = skillRepository.findById(id).orElse(null);
       return habilidad;
    }
    
    @Override //crear o modificar skills
    public void saveSkill(Skill ski) {
       skillRepository.save(ski);
    }
    @Override // borrar skills
    public void delete(Integer id){
        skillRepository.deleteById(id);
    }
    
     @Override
     public void edit(Skill ski){
        skillRepository.save(ski);
    }

    @Override //traer la skill
    public Skill findSkill(Integer id) {
       Skill ski =skillRepository.findById(id).orElse(null);
        return ski;
    }
    
   //busca lista de relojes por la id de la persona
     @Override
    public List<Skill> findByPersonaId(Long personaId) {
        return skillRepository.findByPersonaId(personaId);
    }
    
}