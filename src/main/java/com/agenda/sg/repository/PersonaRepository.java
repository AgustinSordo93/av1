package com.agenda.sg.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.agenda.sg.entity.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
	
	@Query("select p from Persona p where p.nombre like '%:patron%'")
	public List<Persona> getPersonasConPatron(@Param("patron") String patron);

	public List<Persona> findByNombreContains(String patron);

}
