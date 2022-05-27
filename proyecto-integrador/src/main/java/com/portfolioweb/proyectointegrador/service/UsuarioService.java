
package com.portfolioweb.proyectointegrador.service;

import com.portfolioweb.proyectointegrador.exception.UserNotFoundException;
import com.portfolioweb.proyectointegrador.model.Usuario;
import com.portfolioweb.proyectointegrador.repo.UsuarioRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


    
@Service
@Transactional
public class UsuarioService { 
    private final UsuarioRepo usuarioRepo;
    
    @Autowired
    public UsuarioService(UsuarioRepo usuarioRepo){
        
        this.usuarioRepo = usuarioRepo;       
    }
    
    public Usuario addUsuario (Usuario usuario){ 
        
        //usuario.setUsuarioCode(UUID.randomUUID().toString());
   
        return usuarioRepo.save(usuario);    
    }
    
    public List<Usuario> findAllUsuarios(){
    
        return usuarioRepo.findAll();
    }
    
    
    public Usuario updateUsuario(Usuario usuario){
    
        return usuarioRepo.save(usuario);    
    }
    
     public Usuario findUsuarioById(Long id){
        return usuarioRepo.findUsuarioById(id)
                .orElseThrow(() ->new UserNotFoundException("Usuario no encontrado"));
    }
    
    public void deleteUsuario(Long id){
        
        usuarioRepo.deleteUsuarioById(id);
    }
    
   
    
}
    

