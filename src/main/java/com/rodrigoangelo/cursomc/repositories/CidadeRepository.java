package com.rodrigoangelo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rodrigoangelo.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
