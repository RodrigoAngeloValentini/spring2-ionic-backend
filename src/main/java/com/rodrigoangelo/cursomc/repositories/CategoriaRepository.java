package com.rodrigoangelo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoangelo.cursomc.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
