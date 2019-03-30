package com.agenda.sg.service;

import java.util.List;

import com.agenda.sg.entity.Localidad;

public interface LocalidadService {
	
	public List<Localidad> getAll();
	public Localidad getById(Long id);
	public Localidad save(Localidad localidad);
	public Localidad delete(Long id);

}
