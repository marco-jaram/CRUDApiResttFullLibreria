package com.mtec.service;

import java.util.List;
import com.mtec.model.Libro;

public interface ILibroService {
	public List<Libro> listarLibros();
	   public Libro crearLibro(Libro libro);
	   public  void eliminarLibro(Long id);
	   public  Libro editarLibro(Libro libro);
	   public  Libro obtenerLibroPorId(Long id);
	   public List<Libro> obtenerTodosLosLibros();
}
