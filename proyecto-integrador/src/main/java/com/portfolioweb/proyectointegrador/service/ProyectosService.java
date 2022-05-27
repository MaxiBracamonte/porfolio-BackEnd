
package com.portfolioweb.proyectointegrador.service;

import com.portfolioweb.proyectointegrador.model.Proyectos;
import com.portfolioweb.proyectointegrador.repo.ProyectosRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProyectosService {
    
    
    
    private final ProyectosRepo proyectosRepo;
    
    @Autowired
    public ProyectosService(ProyectosRepo proyectosRepo){
        
        this.proyectosRepo = proyectosRepo;       
    }
    
    public Proyectos addProyectos(Proyectos proyectos){
    
        return proyectosRepo.save(proyectos);    
    }
    
    public List<Proyectos> getProyectos(){
    
        return proyectosRepo.findAll();
    }
    
    
    public Proyectos updateProyectos(Proyectos proyectos){
    
    return proyectosRepo.save(proyectos);    
    }
    
    public void deleteProyectos(Long id){
        
        proyectosRepo.deleteById(id);
    }
    
}
