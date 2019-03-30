package com.agenda.sg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.sg.entity.Contacto;
import com.agenda.sg.repository.ContactoRepository;
@RestController
@RequestMapping("/contactos")
public class ContactoController {

	@Autowired
	private ContactoRepository contactoRepository;
	
	@GetMapping
	public List<Contacto> getall(){
		return this.contactoRepository.findAll();
	}
	
	@PostMapping
	public Contacto save(@RequestBody Contacto c) {
		return this.contactoRepository.save(c);
	}
	
	@GetMapping("/{id}")
	public Contacto getByid(@PathVariable("id") Long Id) {
		return this.contactoRepository.findById(Id).orElse(null);
}
	
}


