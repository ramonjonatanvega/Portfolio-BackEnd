
package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    public List<Proyecto> list();
    public void saveProyecto(Proyecto proyec);
    public void delete(Integer id);
    public Proyecto findProyecto(Integer id);
    public List<Proyecto> findByPersonaId(Long personaId);
    public Proyecto getOne(int id);
    public void edit(Proyecto proye);
}
