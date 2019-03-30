package com.agenda.sg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenda.sg.entity.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {

}
