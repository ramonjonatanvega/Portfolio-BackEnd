
package com.portfolio.ArgentinaPrograma.controller;
import com.portfolio.ArgentinaPrograma.model.Proyecto;
import com.portfolio.ArgentinaPrograma.service.IProyectoService;
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
@RequestMapping("proyecto")
@CrossOrigin(origins= "http://localhost:4200")
public class ProyectoController {
   
     @Autowired
    private IProyectoService interProyec;
    
    @ResponseBody   
    @GetMapping("/lista")
    public ResponseEntity<List<Proyecto>>lista(){
        List<Proyecto> list = interProyec.list();
        return new ResponseEntity(list,HttpStatus.OK);
    }  
    
    //lista de relojes por id de persona
    @GetMapping ("/persona/{id}/lista")
    public List <Proyecto> listaPer(@PathVariable Long id){
        return interProyec.findByPersonaId(id);    
        }
    
    //ver experiencia por id
    @GetMapping("/detail/{id}")
    public ResponseEntity<Proyecto> detail(@PathVariable("id") int id){
        Proyecto proye = interProyec.getOne(id);
        return new ResponseEntity(proye, HttpStatus.OK);
    }
    
    //Metodo para crear proyecto
     @PostMapping("/crear")
    public void createProyec(@RequestBody Proyecto proyec){
        interProyec.saveProyecto(proyec);   
    }
    
    @PutMapping("/update")
    public void edit(@RequestBody Proyecto proye) {
        interProyec.edit(proye);
    }
    
    //Metodo para borrar por id
    @DeleteMapping("/borrar/{id}")
    public void delete(@PathVariable ("id") Integer id){
        interProyec.delete(id);
    }
    
     @PutMapping("/editar/{id}")
    public Proyecto editProyec(@PathVariable Integer id,
                                       @RequestParam("nombre") String nuevoNombre,
                                       @RequestParam("imagen") String nuevaImagen,
                                       @RequestParam("fecha") String nuevoFecha,                                      
                                       @RequestParam("descripcion") String nuevaDescripcion,
                                       @RequestParam("url") String nuevoUrl){
        Proyecto proyec =interProyec.findProyecto(id);
         
        proyec.setNombre(nuevoNombre);
        proyec.setImagen(nuevaImagen);
        proyec.setFecha(nuevoFecha);      
        proyec.setDescripcion(nuevaDescripcion);
        proyec.setUrl(nuevoUrl);
        
        
        interProyec.saveProyecto(proyec);
        return proyec;
    }
    
}
