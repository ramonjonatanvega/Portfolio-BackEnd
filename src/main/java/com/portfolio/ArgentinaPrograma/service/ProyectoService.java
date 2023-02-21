
package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Proyecto;
import com.portfolio.ArgentinaPrograma.repository.IProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    private IProyecto proyecRepository;
    
    @Override //ver lista de proyectos
    public List<Proyecto> list() {
        return proyecRepository.findAll();
    }

    @Override //crear o modificar el proyecto
    public void saveProyecto(Proyecto proyec) {
        proyecRepository.save(proyec);
    }

    @Override
    public Proyecto getOne(int id){
        Proyecto proye = proyecRepository.findById(id).orElse(null);
        return proye;
    } 
    
    @Override // borrar proyecto
    public void delete(Integer id) {
        proyecRepository.deleteById(id);
    }
    
    @Override
       public void edit(Proyecto proye){
        proyecRepository.save(proye);
    }

    @Override //traer el proyecto
    public Proyecto findProyecto(Integer id) {
        Proyecto proyec=proyecRepository.findById(id).orElse(null);
       return proyec;
    }
    
     //busca lista de relojes por la id de la persona
    @Override
    public List<Proyecto> findByPersonaId(Long personaId) {
        return proyecRepository.findByPersonaId(personaId);
    }
    
}

