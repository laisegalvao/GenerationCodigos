package com.atividadegeneration.atividade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade")

public class AtividadeSpringController {

	@GetMapping 
	public String atividade () {
		return "A mentalidade de persistência foi e é bastante utilizada para aprender, "
				+ "estudar e desenvolver o assunto Spring. Pois, é necessário revisar o assunto,"
				+ "sanar as dúvidas e reponder atividades para fixar bem o assunto.";
	}
}
