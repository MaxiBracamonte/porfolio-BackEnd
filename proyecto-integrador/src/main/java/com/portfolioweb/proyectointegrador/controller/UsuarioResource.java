
package com.portfolioweb.proyectointegrador.controller;

import com.portfolioweb.proyectointegrador.model.Usuario;
import com.portfolioweb.proyectointegrador.service.UsuarioService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/usuario")
public class UsuarioResource {
    
    private final UsuarioService usuarioService;

    public UsuarioResource(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
    @GetMapping("/find/all")    
    public ResponseEntity<List<Usuario>> getAllUsuarios(){
          List<Usuario> usuarios = usuarioService.findAllUsuarios();
          return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }
    
    @GetMapping("/find/{id}")
    public ResponseEntity <Usuario> getUsuarioById(@PathVariable("id") Long id){
          Usuario usuario = usuarioService.findUsuarioById(id);
          return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario){
    
        Usuario newUsuario=usuarioService.addUsuario(usuario);
        return new ResponseEntity<>(newUsuario, HttpStatus.CREATED);
    
    }      
    
    @PutMapping("/update")
    public ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario usuario){
    
        Usuario updateUsuario=usuarioService.updateUsuario(usuario);
        return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
    
    }  
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> updateUsuario(@PathVariable("id") Long id){
    
        usuarioService.deleteUsuario(id);
        return new ResponseEntity<>(HttpStatus.OK);
    
    }  
    
}
