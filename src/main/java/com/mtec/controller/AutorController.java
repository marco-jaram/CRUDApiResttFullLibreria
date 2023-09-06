package com.mtec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtec.model.Autor;
import com.mtec.service.AutorService;

@RestController
@RequestMapping("/autor")
public class AutorController {
	@Autowired
	private AutorService autorService;

	@GetMapping("/traer")
	public List<Autor> listarAutores() {
		return autorService.listarAutores();

	}

	@PostMapping("/crear")
	public Autor crearAutor(@RequestBody Autor autor) {
		return autorService.crearAutor(autor);
	}

	@DeleteMapping("eliminar/{id}")
	public void eliminarAutor(@PathVariable Long id) {
		autorService.eliminarAutor(id);
	}

	@PutMapping("/editar")
	public Autor editarAutor(@RequestBody Autor autor) {
		return autorService.editarAutor(autor);
	}

	@GetMapping("/obtener/{id}")
	public Autor obtenerAutor(@PathVariable Long id) {
		return autorService.obtenerAutorPorId(id);
	}
}
