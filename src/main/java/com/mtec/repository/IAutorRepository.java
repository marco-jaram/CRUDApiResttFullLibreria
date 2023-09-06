package com.mtec.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtec.model.Autor;

public interface IAutorRepository extends JpaRepository<Autor, Long>  {

}
