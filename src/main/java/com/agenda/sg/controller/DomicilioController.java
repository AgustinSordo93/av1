package com.agenda.sg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.sg.entity.Domicilio;
import com.agenda.sg.repository.DomicilioRepository;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController {

	@Autowired
	private DomicilioRepository domicilioRepository;
	
	@GetMapping
	public List<Domicilio> getall(){
		return this.domicilioRepository.findAll();
	}
	
	@PostMapping
	public Domicilio save(@RequestBody Domicilio c) {
		return this.domicilioRepository.save(c);
	}
	
	@GetMapping("/{id}")
	public Domicilio getByid(@PathVariable("id") Long Id) {
		return this.domicilioRepository.findById(Id).orElse(null);
	}

}
