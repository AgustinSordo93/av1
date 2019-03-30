package com.agenda.sg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.sg.entity.Domicilio;
import com.agenda.sg.repository.DomicilioRepository;
import com.agenda.sg.service.DomicilioService;

@Service
public class DomicilioServiceImpl implements DomicilioService {

	@Autowired
	private DomicilioRepository domicilioRepository;
	
	@Override
	public List<Domicilio> getAll() {
		return this.domicilioRepository.findAll();
	}

	@Override
	public Domicilio getById(Long id) {
		return this.domicilioRepository.findById(id).orElse(null);
	}
	@Override
	public Domicilio save(Domicilio domicilio) {
		return this.domicilioRepository.save(domicilio);
	}

	@Override
	public Domicilio delete(Long id) {
		Domicilio domicilio = this.getById(id);
		if (domicilio != null) {
			this.domicilioRepository.delete(domicilio);
		}
		return domicilio;
}
}
