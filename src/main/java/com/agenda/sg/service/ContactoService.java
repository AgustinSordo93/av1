package com.agenda.sg.service;

import java.util.List;

import com.agenda.sg.entity.Contacto;


public interface ContactoService {
	
	public List<Contacto> getAll();
	public Contacto getById(Long id);
	public Contacto save(Contacto contacto);
	public Contacto delete(Long id);

}
