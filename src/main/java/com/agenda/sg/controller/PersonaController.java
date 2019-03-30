package com.agenda.sg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.agenda.sg.entity.Persona;
import com.agenda.sg.service.PersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private PersonaService personaService;

	@GetMapping
	public List<Persona> getall(
			@RequestParam(name = "patron", required = false) String patron
			){
		return this.personaService.getAllByPatron(patron);
				}
	@PostMapping
	public Persona save(@RequestBody Persona c) {
		return this.personaService.save(c);
	}
	
	@GetMapping("/{id}")
	public Persona getByid(@PathVariable("id") Long id) {
		return this.personaService.getById(id);
}
	
	
	
	
	
	
}
