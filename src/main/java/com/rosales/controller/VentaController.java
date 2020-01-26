package com.rosales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rosales.model.Venta;
import com.rosales.service.IVentaService;

@RestController
@RequestMapping("/ventas")
public class VentaController {

	@Autowired
	private IVentaService service;
	
	@PostMapping
	public ResponseEntity<Venta> registrar(@RequestBody Venta v){
		Venta vent = service.registrarTransaccional(v);	
		return new ResponseEntity<Venta>(vent, HttpStatus.CREATED);
	}
	
}
