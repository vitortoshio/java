package com.atividade.ava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atividade.ava.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	
	
}


