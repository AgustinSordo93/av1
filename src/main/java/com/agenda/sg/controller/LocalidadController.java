package com.agenda.sg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.sg.repository.LocalidadRepository;
import com.agenda.sg.entity.Localidad;

@RestController
@RequestMapping("/localidades")
public class LocalidadController {
	
	@Autowired
	private LocalidadRepository localidadRepository;
	
	@GetMapping
	public List<Localidad> getall(){
		return this.localidadRepository.findAll();
	}
	
	@PostMapping
	public Localidad save(@RequestBody Localidad c) {
		return this.localidadRepository.save(c);
	}
	
	@GetMapping("/{id}")
	public Localidad getByid(@PathVariable("id") Long Id) {
		return this.localidadRepository.findById(Id).orElse(null);
}

}
