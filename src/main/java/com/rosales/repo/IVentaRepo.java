package com.rosales.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rosales.model.Venta;

public interface IVentaRepo extends JpaRepository<Venta, Integer>{

}
