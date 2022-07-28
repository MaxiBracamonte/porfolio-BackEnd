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

import com.example.demo.entity.Acercade;
import com.example.demo.repository.AcercadeRepository;

@Service
@Transactional
public class SobremiService {
	
	@Autowired
	AcercadeRepository acercadeRepository;
	
	public List<Acercade> list(){
		return acercadeRepository.findAll();
	}
	
	public Optional<Acercade> getOne(int id){
		return acercadeRepository.findById(id);
	}
	
	public Optional<Acercade> getByTexto(String texto) {
		return acercadeRepository.findByTexto(texto);
	}
	
	public Acercade save(Acercade acercade) {
		return acercadeRepository.save(acercade);  
	}
	
	public void delete(int id) {
		acercadeRepository.deleteById(id);
	}
	
	public boolean existsById(int id) {
		return acercadeRepository.existsById(id);
	}
	
	public boolean existsByTexto(String texto) {
		return acercadeRepository.existsByTexto(texto);
	}

}
