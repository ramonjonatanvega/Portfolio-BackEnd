
package com.portfolio.ArgentinaPrograma.controller;

import com.portfolio.ArgentinaPrograma.model.Educacion;
import com.portfolio.ArgentinaPrograma.service.IEducacionService;
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
@RequestMapping("educacion")
@CrossOrigin(origins= "http://localhost:4200")
public class EducacionController {
    
     @Autowired
    private IEducacionService interEdu;
    
     @ResponseBody  
     @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = interEdu.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
       //lista de relojes por id de persona
    @GetMapping ("/persona/{id}/lista")
    public List <Educacion> listaPer(@PathVariable Long id){
        return interEdu.findByPersonaId(id);    
        }
    //ver educacion por id
     @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> detail(@PathVariable("id") int id){
        Educacion educa = interEdu.getOne(id);
        return new ResponseEntity(educa, HttpStatus.OK);
    }
    
    //crea educacion
    @PostMapping("/crear")
    public void createEdu(@RequestBody Educacion edu){
        interEdu.saveEducacion(edu);
    }
    
    
    
    @PutMapping("/update")
    public void edit(@RequestBody Educacion edu) {      
        interEdu.edit(edu);
    }
    
    //borrar educacion por id
    @DeleteMapping("/borrar/{id}")
    public void delete(@PathVariable ("id") Integer id){
        interEdu.delete(id);
    }
    
    //editar experiencia por id
    @PutMapping("/editar/{id}")
    public Educacion editEducacion(@PathVariable Integer id,
                                       @RequestParam("nombreInstitucion") String nuevoNombreInstitucion,
                                       @RequestParam("logoInstitucion") String nuevoLogoInstitucion,
                                       @RequestParam("titulo") String nuevaTitulo,
                                       @RequestParam("fechaInicio") String nuevaFechaInicio,
                                       @RequestParam("fechaFin") String nuevaFechaFin,                                       
                                       @RequestParam("esEstudioActual") boolean nuevoEsEstudioActual){
        Educacion edu =interEdu.findEducacion(id);
         
        edu.setNombreInstitucion(nuevoNombreInstitucion);
        edu.setLogoInstitucion(nuevoLogoInstitucion);
        edu.setTitulo(nuevaTitulo);
        edu.setFechaInicio(nuevaFechaInicio);
        edu.setFechaFin(nuevaFechaFin);       
        edu.setEsEstudioActual(nuevoEsEstudioActual);
        interEdu.saveEducacion(edu);
        return edu;
    }
    
}
