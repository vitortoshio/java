package com.sesi.imc_calculator.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sesi.imc_calculator.model.Pessoa;

public interface PessoaRepositorio extends JpaRepository<Pessoa, Long>{

}
