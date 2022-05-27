/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioweb.proyectointegrador.service;

import com.portfolioweb.proyectointegrador.model.Experiencia;
import com.portfolioweb.proyectointegrador.repo.ExperienciaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ExperienciaService {
    
    
     private final ExperienciaRepo experienciaRepo;
    
    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo){
        
        this.experienciaRepo = experienciaRepo;       
    }
    
    public Experiencia addExperiencia(Experiencia experiencia){
    
        return experienciaRepo.save(experiencia);    
    }
    
    public List<Experiencia> getExperiencia(){
    
        return experienciaRepo.findAll();
    }
    
    
    public Experiencia updateExperiencia(Experiencia experiencia){
    
    return experienciaRepo.save(experiencia);    
    }
    
    public void deleteExperiencia(Long id){
        
        experienciaRepo.deleteById(id);
    }
    
}
