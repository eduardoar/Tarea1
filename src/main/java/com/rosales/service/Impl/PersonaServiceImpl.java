package com.rosales.service.Impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rosales.model.Persona;
import com.rosales.repo.IPersonaRepo;
import com.rosales.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaRepo repo;
	
	@Override
	public Persona registrar(Persona obj) {
		return repo.save(obj);
	}

	@Override
	public Persona modificar(Persona obj) {
		return repo.save(obj);
	}

	@Override
	public List<Persona> listar() {
		List<Persona> lstPersona = repo.findAll();
		return lstPersona;
	}

	@Override
	public Persona listarPorId(Integer id) {
		Optional<Persona> opPersona = repo.findById(id);
		return opPersona.isPresent() ? opPersona.get() : new Persona();
	}

	@Override
	public void eliminar(Integer id) {
		 repo.deleteById(id);
	}

}
