package com.sesi.imc_calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sesi.imc_calculator.Repositorio.PessoaRepositorio;
import com.sesi.imc_calculator.model.Pessoa;

import ch.qos.logback.core.model.Model;

@Controller
public class IMCController {
	
	private PessoaRepositorio pessoaRepositorio;
	
	@GetMapping("/")
	public String showForm() {
		return "form";
	}
	
	@PostMapping("/calcular")
	public String calcularIMC(@RequestParam String nome,  @RequestParam double altura,@RequestParam double peso, Model model) {

		double imc = peso / (altura * altura);
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setAltura(altura);
		pessoa.setPeso(peso);
		pessoa.setImc(imc);
		
		return "form";
	}
}