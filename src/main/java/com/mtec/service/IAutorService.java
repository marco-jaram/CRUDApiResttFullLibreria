package com.mtec.service;

import java.util.List;

import com.mtec.model.Autor;

public interface IAutorService {
	
	   public List<Autor> listarAutores();
	   public Autor crearAutor(Autor autor);
	   public  void eliminarAutor(Long id);
	   public  Autor editarAutor(Autor autor);
	   public  Autor obtenerAutorPorId(Long id);
	
}
