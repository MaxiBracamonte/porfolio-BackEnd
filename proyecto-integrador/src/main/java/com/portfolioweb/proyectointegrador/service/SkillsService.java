
package com.portfolioweb.proyectointegrador.service;

import com.portfolioweb.proyectointegrador.model.Skills;
import com.portfolioweb.proyectointegrador.repo.SkillsRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SkillsService {

private final SkillsRepo skillsRepo;
    
    @Autowired
    public SkillsService(SkillsRepo skillsRepo){
        
        this.skillsRepo = skillsRepo;       
    }
    
    public Skills addSkills(Skills skills){
    
        return skillsRepo.save(skills);    
    }
    
    public List<Skills> getSkills(){
    
        return skillsRepo.findAll();
    }
    
    
    public Skills updateSkills(Skills skills){
    
    return skillsRepo.save(skills);    
    }
    
    public void deleteSkills(Long id){
        
        skillsRepo.deleteById(id);
    }

}
