package com.mtec.model;


import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Autor {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_autor;
    private String nombre;
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<Libro> libros = new ArrayList<>();
	public Long getId_autor() {
		return id_autor;
	}
	public void setId_autor(Long id_autor) {
		this.id_autor = id_autor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Libro> getLibros() {
		return libros;
	}
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	public Autor() {
		super();
	}
	public Autor(Long id_autor, String nombre, List<Libro> libros) {
		super();
		this.id_autor = id_autor;
		this.nombre = nombre;
		this.libros = libros;
	}
    
    
   
}
