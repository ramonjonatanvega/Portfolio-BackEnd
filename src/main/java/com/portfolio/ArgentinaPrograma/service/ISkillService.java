
package com.portfolio.ArgentinaPrograma.service;

import com.portfolio.ArgentinaPrograma.model.Skill;
import java.util.List;


public interface ISkillService {
    public List<Skill> list();
    public void saveSkill(Skill ski);
    public void delete(Integer id);
    public Skill findSkill(Integer id);
    public List<Skill> findByPersonaId(Long personaId);
    public Skill getOne(int id);
    public void edit(Skill ski);
}
