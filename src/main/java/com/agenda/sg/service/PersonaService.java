package com.agenda.sg.service;

import java.util.List;
import com.agenda.sg.entity.Persona;
public interface PersonaService {
	
public List<Persona> getAll();
	
	public Persona getById(Long id);
	public List<Persona> getAllByPatron(String patron);
	public Persona save(Persona persona);
	public Persona delete(Long id);

	

}
