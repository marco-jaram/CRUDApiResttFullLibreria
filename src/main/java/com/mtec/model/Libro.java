package com.mtec.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Libro {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_libro;
    private String titulo;
    private int anio;
    
    @ManyToOne
    @JoinColumn(name = "id_autor")
    private Autor autor;

	public Libro() {
		super();
	}

	public Libro(Long id_libro, String titulo, int anio, Autor autor) {
		super();
		this.id_libro = id_libro;
		this.titulo = titulo;
		this.anio = anio;
		this.autor = autor;
	}

	public Long getId_libro() {
		return id_libro;
	}

	public void setId_libro(Long id_libro) {
		this.id_libro = id_libro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
    

}
