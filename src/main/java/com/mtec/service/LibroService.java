package com.mtec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtec.model.Libro;
import com.mtec.repository.ILibroRepository;
@Service
public class LibroService implements ILibroService{
@Autowired
private ILibroRepository libroRepository;


	@Override
	public List<Libro> listarLibros() {
		return libroRepository.findAll();
	}

	@Override
	public Libro crearLibro(Libro libro) {
		return libroRepository.save(libro);
	}

	@Override
	public void eliminarLibro(Long id) {
		libroRepository.deleteById(id);
		
	}

	@Override
	public Libro editarLibro(Libro libro) {
		return libroRepository.save(libro);
	}

	@Override
	public Libro obtenerLibroPorId(Long id) {
		
		return libroRepository.findById(id).orElse(null);
	}

	@Override
	public List<Libro> obtenerTodosLosLibros() {
		 return listarLibros();
	}

}
