package com.mtec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtec.model.Libro;

public interface ILibroRepository extends JpaRepository<Libro, Long>  {

}
