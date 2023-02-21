
package com.portfolio.ArgentinaPrograma.repository;

import com.portfolio.ArgentinaPrograma.model.Experiencia;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IExperiencia extends JpaRepository<Experiencia, Integer> {

    public List<Experiencia> findByPersonaId(Long personaId);
    
   
}
