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

import com.lojade.lojaeletro.model.Produto;
import com.lojade.lojaeletro.repository.ProdutoRepository;

@RestController
@RequestMapping("/Produto")
@CrossOrigin(value = "*", allowedHeaders = "*")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAllProduto(){ //pepa tudo de produto
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<Produto> getByIdProduto(@PathVariable long id){ //Produto é o nome da classe(q está em Model)
		
		return repository.findById(id).map(produto -> ResponseEntity.ok(produto)) //map. olha chave e valor
				.orElse(ResponseEntity.badRequest().build());
	}
	
	@GetMapping("/valor/{valor1}/{valor2}")
	public ResponseEntity<List<Produto>> getByIdValor2(@PathVariable float valor1, @PathVariable float valor2){
		return ResponseEntity.ok(repository.maiorQueMenorQue(valor1, valor2));
	}
	
	// fazer o segundo método do repository:
	
	//Metodo Post
	@PostMapping
	public ResponseEntity<Produto>post(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}
	//Metodo Put
	@PutMapping
	public ResponseEntity<Produto> put(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(produto));
	}
	//Metodo Delete
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id){
		repository.deleteById(id);
	}	
}

