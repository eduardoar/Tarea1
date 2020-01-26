package com.rosales.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPersona;
	
	@Size(max = 30, message = "Nombre solo puede tener un màximo de 30 caracteres")
	@Column(name = "nombres", nullable = false, length = 30)
	private String nombres;
	
	@Size(max = 30, message = "Apellidos solo puede tener un màximo de 30 caracteres")
	@Column(name = "apellidos", nullable = false, length = 30)
	private String apellidos;

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
}
