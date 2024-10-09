package com.atividade.ava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.ava.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
	
}


