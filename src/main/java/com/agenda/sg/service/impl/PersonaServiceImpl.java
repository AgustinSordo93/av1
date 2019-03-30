package com.agenda.sg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.sg.entity.Persona;
import com.agenda.sg.repository.PersonaRepository;
import com.agenda.sg.service.PersonaService;


@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	@Override
	public List<Persona> getAll() {
		return this.personaRepository.findAll();
	}

	@Override
	public Persona getById(Long id) {
		return this.personaRepository.findById(id).orElse(null);
	}

	@Override
	public List<Persona> getAllByPatron(String patron) {
		List<Persona> result = null;
		if (patron != null) {
			result = this.personaRepository.findByNombreContains(patron);
		} else {
			result = this.personaRepository.findAll();
		}
		return result;
	}

	@Override
	public Persona save(Persona persona) {
		return this.personaRepository.save(persona);
	}

	@Override
	public Persona delete(Long id) {
		Persona persona = this.getById(id);
		if (persona != null) {
			this.personaRepository.delete(persona);
		}
		return persona;
}

	
}
