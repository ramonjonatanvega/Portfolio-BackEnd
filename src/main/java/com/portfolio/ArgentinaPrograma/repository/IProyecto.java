
package com.portfolio.ArgentinaPrograma.repository;

import com.portfolio.ArgentinaPrograma.model.Proyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IProyecto extends JpaRepository<Proyecto, Integer>{
    
    public List<Proyecto> findByPersonaId(Long personaId);
    
}
