package com.farmacia.pharma.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.pharma.model.Farmacia;
import com.farmacia.pharma.repository.FarmaciaRepository;




@RestController
@RequestMapping("/farmacia")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class FarmaciaController {
	
	
	@Autowired
	private FarmaciaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Farmacia>> getAll(){
		return ResponseEntity.ok(repository.findAll());
		
		
}
	@GetMapping("/{id}")
	public ResponseEntity<Farmacia> getById(@PathVariable long id){
		
		return repository.findById(id).map(drogaria -> ResponseEntity.ok(drogaria))
				.orElse(ResponseEntity.badRequest().build());
	}
		
}
