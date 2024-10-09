package com.atividade.ava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.ava.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	
}



