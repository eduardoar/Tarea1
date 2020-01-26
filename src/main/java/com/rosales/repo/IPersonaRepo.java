package com.rosales.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rosales.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer>{

}
