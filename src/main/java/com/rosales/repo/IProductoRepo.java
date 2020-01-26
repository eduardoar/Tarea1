package com.rosales.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rosales.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer>{

}
