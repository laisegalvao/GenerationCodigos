package com.atividadegeneration.atividade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring3")
public class Spring3 {
	
	@GetMapping
	public String spring3() {
		
		return "Atenção aos detalhes é uma habilidade bastante desenvolvida durante todos os"
				+ " assuntos aprendidos e que ganha destaque, mais uma vez, nesse novo assunto: Spring!";
	}
	

}
