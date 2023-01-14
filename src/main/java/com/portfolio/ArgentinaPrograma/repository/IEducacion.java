
package com.portfolio.ArgentinaPrograma.repository;

import com.portfolio.ArgentinaPrograma.model.Educacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEducacion extends JpaRepository<Educacion, Integer>{
    
     //toma la lista de los relojes por persona
    List<Educacion> findByPersonaId(Long personaId);
    
}
