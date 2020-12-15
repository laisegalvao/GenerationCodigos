package com.lojade.lojaeletro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojade.lojaeletro.model.Categoria;
import com.lojade.lojaeletro.repository.CategoriaRepository;

@RestController
@RequestMapping("/Categoria")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> getAllCategoria(){
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Categoria> getByIdCategoria(@PathVariable long id){
		
		return repository.findById(id).map(lojaC -> ResponseEntity.ok(lojaC))
				.orElse(ResponseEntity.badRequest().build());
	}
	
	//Metodo Post
	@PostMapping
	public ResponseEntity<Categoria>post(@RequestBody Categoria lojaC){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(lojaC));
	}
		
    //Metodo Put
	@PutMapping
	public ResponseEntity<Categoria> put(@RequestBody Categoria lojaC){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(lojaC));
		}
	//Metodo Delete
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id){
			repository.deleteById(id);
		}	
	
}

