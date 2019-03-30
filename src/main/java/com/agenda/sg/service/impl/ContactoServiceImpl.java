package com.agenda.sg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.sg.entity.Contacto;
import com.agenda.sg.repository.ContactoRepository;
import com.agenda.sg.service.ContactoService;


@Service
public class ContactoServiceImpl implements ContactoService {
	
	@Autowired
	private ContactoRepository contactoRepository;
	
	@Override
	public List<Contacto> getAll() {
		return this.contactoRepository.findAll();
	}

	@Override
	public Contacto getById(Long id) {
		return this.contactoRepository.findById(id).orElse(null);
	}
	@Override
	public Contacto save(Contacto contacto) {
		return this.contactoRepository.save(contacto);
	}

	@Override
	public Contacto delete(Long id) {
		Contacto contacto = this.getById(id);
		if (contacto != null) {
			this.contactoRepository.delete(contacto);
		}
		return contacto;
}


}
