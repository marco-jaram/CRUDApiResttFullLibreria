package com.mtec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtec.model.Autor;
import com.mtec.repository.IAutorRepository;
@Service
public class AutorService implements IAutorService{
	 @Autowired
	    private IAutorRepository autorRepository;
	 
	@Override
	public List<Autor> listarAutores() {
		 return autorRepository.findAll();
	}

	@Override
	public Autor crearAutor(Autor autor) {
		return autorRepository.save(autor);
	}

	@Override
	public void eliminarAutor(Long id) {
		  autorRepository.deleteById(id);
		
	}

	@Override
	public Autor editarAutor(Autor autor) {
		 return autorRepository.save(autor);
	}

	@Override
	public Autor obtenerAutorPorId(Long id) {
		return autorRepository.findById(id).orElse(null);
	}

}
