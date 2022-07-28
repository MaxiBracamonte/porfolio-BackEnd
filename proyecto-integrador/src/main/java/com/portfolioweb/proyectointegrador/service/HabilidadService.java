/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioweb.proyectointegrador.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Habilidad;
import com.example.demo.repository.HabilidadRepository;

@Service
@Transactional
public class HabilidadService {
	
	@Autowired
	HabilidadRepository habilidadRepository;
	
	public List<Habilidad> list(){
		return habilidadRepository.findAll();
	}
	
	public Optional<Habilidad> getOne(int id){
		return habilidadRepository.findById(id);
	}
	
	public Optional<Habilidad> getByTitulo (String titulo) {
		return habilidadRepository.findByTitulo(titulo);
	}
	
	public Habilidad save(Habilidad habilidad) {
		return habilidadRepository.save(habilidad);  
	}
	
	public void delete(int id) {
		habilidadRepository.deleteById(id);
	}
	
	public boolean existsById(int id) {
		return habilidadRepository.existsById(id);
	}
	
	public boolean existsByTitulo(String titulo) {
		return habilidadRepository.existsByTitulo(titulo);
	}

}
