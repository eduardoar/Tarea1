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

import com.rosales.model.Producto;
import com.rosales.service.IProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private IProductoService service;
	
	@GetMapping
	public ResponseEntity<List<Producto>> listarProducto(){
		List<Producto> lst = service.listar();
		return new ResponseEntity<List<Producto>>(lst, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Producto> listarPorId(@PathVariable("id") Integer id){
		Producto p = service.listarPorId(id);
		return new ResponseEntity<Producto>(p, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Producto> registrar(@RequestBody Producto p){
		Producto pe = service.registrar(p);	
		return new ResponseEntity<Producto>(pe, HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Producto> modificar(@RequestBody Producto p){
		Producto pe = service.modificar(p);	
		return new ResponseEntity<Producto>(pe, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id){
		service.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
	}
	
}
