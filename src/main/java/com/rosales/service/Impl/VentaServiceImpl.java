package com.rosales.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rosales.model.Venta;
import com.rosales.repo.IVentaRepo;
import com.rosales.service.IVentaService;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	private IVentaRepo repo;
	
	@Override
	public Venta registrarTransaccional(Venta ven) {
		
		ven.getDetalleVenta().forEach(det -> {
			det.setVenta(ven);
		});
		
		Venta vent = repo.save(ven);
		return vent;
	}
}
