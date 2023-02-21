
package com.portfolio.ArgentinaPrograma.controller;

import com.portfolio.ArgentinaPrograma.model.Skill;
import com.portfolio.ArgentinaPrograma.service.ISkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("skill")
@CrossOrigin(origins= "http://localhost:4200")
public class SkillController {
   
     @Autowired
    private ISkillService interSkill;
    
    @ResponseBody   
    @GetMapping("/lista")
    public ResponseEntity<List<Skill>>getSkills(){
        List<Skill> list = interSkill.list();
        return new ResponseEntity(list, HttpStatus.OK);
    } 
    
     //lista de relojes por id de persona
    @GetMapping ("/persona/{id}/lista")
    public List <Skill> listaPer(@PathVariable Long id){
        return interSkill.findByPersonaId(id);    
        }
    
    //ver habilidad por id
      @GetMapping("/detail/{id}")
    public ResponseEntity<Skill> detail(@PathVariable("id") int id){
        Skill habilidad = interSkill.getOne(id);
        return new ResponseEntity(habilidad, HttpStatus.OK);
    }
    
    //crear habilidad
    @PostMapping("/crear")
    public void createExp(@RequestBody Skill ski){
        interSkill.saveSkill(ski);
    }
    
     @PutMapping("/update")
    public void edit(@RequestBody Skill habi) {
        interSkill.edit(habi);
    }
    
    //borrar habilidad por id
    @DeleteMapping("/borrar/{id}")
    public void delete(@PathVariable ("id") Integer id){
        interSkill.delete(id);
    }
    
    @PutMapping("/editar/{id}")
    public Skill editSkill(@PathVariable Integer id,
                                       @RequestParam("nombreHabilidad") String nuevoNombreHabilidad,
                                       @RequestParam("porcentaje") String nuevoPorcentaje){
        Skill ski =interSkill.findSkill(id);
         
        ski.setNombreHabilidad(nuevoNombreHabilidad);
        ski.setPorcentaje(nuevoPorcentaje);
       
        interSkill.saveSkill(ski);
        return ski;
    }
    
}
