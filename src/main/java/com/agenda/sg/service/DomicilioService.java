package com.agenda.sg.service;

import java.util.List;

import com.agenda.sg.entity.Domicilio;

public interface DomicilioService {
	
	public List<Domicilio> getAll();
	public Domicilio getById(Long id);
	public Domicilio save(Domicilio domicilio);
	public Domicilio delete(Long id);

}
