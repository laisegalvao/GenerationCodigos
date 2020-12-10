package com.atividadegeneration.atividade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring2")
public class Spring2 {
	
	@GetMapping
	public String spring2() {
		
		return "Outra mentalidade a ser destacada para aprendizagem do assunto Sping é a"
				+ " orientação ao futuro, pois, é preciso continuar desenvolvendo o estudo para"
				+ " alcançar determinadas metas e aprimorar o trabalho. ";
	}

}
