
package com.portfolio.ArgentinaPrograma.controller;

import com.portfolio.ArgentinaPrograma.model.Experiencia;
import com.portfolio.ArgentinaPrograma.service.IExperienciaService;
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
@RequestMapping("experiencia")
@CrossOrigin(origins= "http://localhost:4200")
public class ExperienciaController {
    
     @Autowired
    private IExperienciaService interExp;
     
   @ResponseBody  
   @GetMapping("/lista")
     public ResponseEntity<List<Experiencia>> lista(){
        List<Experiencia> list = interExp.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
   //lista de relojes por id de persona
    @GetMapping ("/persona/{id}/lista")
    public List <Experiencia> listaPer(@PathVariable Long id){
        return interExp.findByPersonaId(id);    
        }
    
    //ver experiencia por id
    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> detail(@PathVariable("id") int id){
        Experiencia exper = interExp.getOne(id);
        return new ResponseEntity(exper, HttpStatus.OK);
    }
    
    //crear experiencia
     @PostMapping("/crear")
    public void createExp(@RequestBody Experiencia exp){
        interExp.saveExperiencia(exp);
    }
    
     @PutMapping("/update")
    public void edit(@RequestBody Experiencia expe) {      
        interExp.edit(expe);
    }
    
    
    //borrar experiencia por id
    @DeleteMapping("/borrar/{id}")
    public void delete(@PathVariable ("id") Integer id){
        interExp.delete(id);
    }
    
    //editar experiencia por id
     @PutMapping("/editar/{id}")
    public  Experiencia editExperiencia(@PathVariable Integer id,
                                       @RequestParam("nombreEmpresa") String nuevaNombreEmpresa,
                                       @RequestParam("logoEmpresa") String nuevoLogoEmpresa,
                                       @RequestParam("puesto") String nuevoPuesto,
                                       @RequestParam("descripcion") String nuevaDescripcion,
                                       @RequestParam("fechaInicio") String nuevaFechaInicio,
                                       @RequestParam("fechaFin") String nuevaFechaFin,                                                                                   
                                       @RequestParam("esTrabajoActual") boolean nuevoEsTrabajoActual){
        Experiencia exp =interExp.findExperiencia(id);
        
        exp.setNombreEmpresa(nuevaNombreEmpresa);
        exp.setLogoEmpresa(nuevoLogoEmpresa);
        exp.setPuesto(nuevoPuesto);
        exp.setDescripcion(nuevaDescripcion);
        exp.setFechaInicio(nuevaFechaInicio);
        exp.setFechaFin(nuevaFechaFin);              
        exp.setEsTrabajoActual(nuevoEsTrabajoActual);
        interExp.saveExperiencia(exp);
        return exp;
    }
    
      
     @PutMapping("/edit/{id}")
    public ResponseEntity<?> updateExp(@PathVariable("id") int id, @RequestBody Experiencia experiencia) {
        try {

            Experiencia exper = interExp.gettwo(id).get();
            experiencia.setNombreEmpresa(experiencia.getNombreEmpresa());
            experiencia.setLogoEmpresa(experiencia.getLogoEmpresa());
            experiencia.setPuesto(experiencia.getPuesto());
            experiencia.setDescripcion(experiencia.getDescripcion());
            experiencia.setFechaInicio(experiencia.getFechaInicio());
            experiencia.setFechaFin(experiencia.getFechaFin());
            experiencia.setEsTrabajoActual(experiencia.isEsTrabajoActual());

            interExp.saveExperiencia(experiencia);

            return new ResponseEntity<Experiencia>(HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<Experiencia>(HttpStatus.NOT_FOUND);
        }
    }
    
}
