
package com.porfolio.Gerardocornalo.Service;

import com.porfolio.Gerardocornalo.Entity.Proyectos;
import com.porfolio.Gerardocornalo.Repository.RProyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyectos {
     @Autowired
     RProyectos rProyectos;
     
     public List<Proyectos> list(){
         return rProyectos.findAll();
     }
     
     public Optional<Proyectos> getOne(int id){
         return rProyectos.findById(id);
     }
     
     public Optional<Proyectos> getByNombreE(String nombreE){
         return rProyectos.findByNombreE(nombreE);
     }
     
     public void save(Proyectos proye){
         rProyectos.save(proye);
     }
     
     public void delete(int id){
         rProyectos.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rProyectos.existsById(id);
     }
     
     public boolean existsByNombreE(String nombreE){
         return rProyectos.existsByNombreE(nombreE);
     }
}
