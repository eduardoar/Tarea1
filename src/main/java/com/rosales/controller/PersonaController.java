package com.rosales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rosales.model.Persona;
import com.rosales.service.IPersonaService;

@RestController
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	private IPersonaService service;
	
	@GetMapping
	public ResponseEntity<List<Persona>> listarPersona(){
		List<Persona> lst = service.listar();
		return new ResponseEntity<List<Persona>>(lst, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Persona> listarPorId(@PathVariable("id") Integer id){
		Persona p = service.listarPorId(id);
		return new ResponseEntity<Persona>(p, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Persona> registrar(@RequestBody Persona p){
		Persona pe = service.registrar(p);	
		return new ResponseEntity<Persona>(pe, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Persona> modificar(@RequestBody Persona p){
		Persona pe = service.modificar(p);	
		return new ResponseEntity<Persona>(pe, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
		service.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
	
}
