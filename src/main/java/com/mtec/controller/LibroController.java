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

import com.mtec.model.Libro;
import com.mtec.service.LibroService;

@RestController
@RequestMapping("/libro")
public class LibroController {
	  @Autowired
	    private LibroService libroService;

	    @GetMapping("/traer")
	    public List<Libro> listarLibros() {
	        return libroService.listarLibros();
	    }
//	    este metodo fue una prueba debe eliminarse desde la interface
	    @GetMapping("/todos")
	    public List<Libro> obtenerTodosLosLibros() {
	        return libroService.listarLibros();
	    }

	    @PostMapping("/crear")
	    public Libro crearLibro(@RequestBody Libro libro) {
	        return libroService.crearLibro(libro);
	    }

	    @DeleteMapping("/eliminar/{id}")
	    public void eliminarLibro(@PathVariable Long id) {
	        libroService.eliminarLibro(id);
	    }

	    @PutMapping("/editar")
	    public Libro editarLibro(@RequestBody Libro libro) {
	        return libroService.editarLibro(libro);
	    }

	    @GetMapping("/obtener/{id}")
	    public Libro obtenerLibro(@PathVariable Long id) {
	        return libroService.obtenerLibroPorId(id);
	    }	

}
