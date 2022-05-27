
package com.portfolioweb.proyectointegrador.repo;

import com.portfolioweb.proyectointegrador.model.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
    
    void deleteUsuarioById(Long id);
    Optional<Usuario> findUsuarioById(Long id);
    
}
