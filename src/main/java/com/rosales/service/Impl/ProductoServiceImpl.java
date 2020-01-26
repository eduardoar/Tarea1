package com.rosales.service.Impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rosales.model.Producto;
import com.rosales.repo.IProductoRepo;
import com.rosales.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepo repo;
	
	@Override
	public Producto registrar(Producto obj) {
		return repo.save(obj);
	}

	@Override
	public Producto modificar(Producto obj) {
		return repo.save(obj);
	}

	@Override
	public List<Producto> listar() {
		List<Producto> lstProducto = repo.findAll();
		return lstProducto;
	}

	@Override
	public Producto listarPorId(Integer id) {
		Optional<Producto> opProducto = repo.findById(id);
		return opProducto.isPresent() ? opProducto.get() : new Producto();
	}

	@Override
	public void eliminar(Integer id) {
		 repo.deleteById(id);
	}

}
