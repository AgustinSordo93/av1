package com.agenda.sg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.sg.entity.Localidad;
import com.agenda.sg.repository.LocalidadRepository;
import com.agenda.sg.service.LocalidadService;

@Service
public class LocalidadServiceImpl implements LocalidadService {
	
	@Autowired
	private LocalidadRepository localidadRepository;
	
	@Override
	public List<Localidad> getAll() {
		return this.localidadRepository.findAll();
	}

	@Override
	public Localidad getById(Long id) {
		return this.localidadRepository.findById(id).orElse(null);
	}
	@Override
	public Localidad save(Localidad localidad) {
		return this.localidadRepository.save(localidad);
	}

	@Override
	public Localidad delete(Long id) {
		Localidad localidad = this.getById(id);
		if (localidad != null) {
			this.localidadRepository.delete(localidad);
		}
		return localidad;
}

}
