
package com.portfolioweb.proyectointegrador.service;

import com.portfolioweb.proyectointegrador.model.Educacion;
import com.portfolioweb.proyectointegrador.repo.EducacionRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EducacionService {
    
    private final EducacionRepo educacionRepo;
    
    @Autowired
    public EducacionService(EducacionRepo educacionRepo){
        
        this.educacionRepo = educacionRepo;       
    }
    
    public Educacion addEducacion(Educacion educacion){
    
        return educacionRepo.save(educacion);    
    }
    
    public List<Educacion> getEducacion(){
    
        return educacionRepo.findAll();
    }
    
    
    public Educacion updateEducacion(Educacion educacion){
    
    return educacionRepo.save(educacion);    
    }
    
    public void deleteEducacion(Long id){
        
        educacionRepo.deleteById(id);
    }
}
