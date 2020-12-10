package com.atividadegeneration.atividade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring4")
public class Spring4 {
	
	@GetMapping
	public String spring4 () {
		
		return "A comunicação é uma habilidade eficaz para a aprendizagem. Estar sempre fazendo"
				+ " perguntas e sanando dúvidas são boas ferramentas para aprimorar a comunicação"
				+ " e compreender melhor o assunto. ";
		
	}

}
