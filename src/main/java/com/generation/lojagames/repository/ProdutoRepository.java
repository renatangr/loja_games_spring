package com.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.lojagames.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	List<Produto> findAllByTituloContainingIgnoreCase(String titulo);
	
	List<Produto> findAllByPrecoLessThan(Double preco); // Seleciona valores menores do que o critério da consulta
	
	List<Produto> findAllByPrecoGreaterThan(Double preco); // Seleciona valores maiores do que o critério da consulta

}
