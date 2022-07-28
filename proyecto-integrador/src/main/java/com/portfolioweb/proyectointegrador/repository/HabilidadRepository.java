/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioweb.proyectointegrador.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Habilidad;

@Repository
public interface HabilidadRepository extends JpaRepository<Habilidad, Integer> {
	
	Optional<Habilidad> findByTitulo (String titulo);
	boolean existsByTitulo (String titulo);

}