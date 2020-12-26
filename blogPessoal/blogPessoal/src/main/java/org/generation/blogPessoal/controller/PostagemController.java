package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.generation.blogPessoal.repository.PostagemRepository;
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

@RestController //informa p Spring q essa classe se trata de um controlador  
@RequestMapping("/postagens") // informar por qual Url(rota) essa classe sera acessada 
@CrossOrigin("*")//O * para indicar que a APi vai aceitar requisicoes de qlq origem
public class PostagemController {
	
		@Autowired //como é interface n consegue instanciar, o over..serve p dar essa injecao de dependencia do spring
		private PostagemRepository repository; //injetando o repositorio dentro do controler
	    //garante, entao, que todos os servicos da interface (Postagemrepositoty) sejam acessados a partir do controller
	
		@GetMapping //metodo FindAll
		public ResponseEntity<List<Postagem >> GetAll() { //tipo Response..., q retorna uma lista do tipo postagem
										//nome do metodo GetAll() ---> n recebe nada como parametro
		return ResponseEntity.ok(repository.findAll()); //chamando requisicao de todas as postagens
		}
	
		@GetMapping("/{id}") //busca por ID la no postman
		public ResponseEntity<Postagem> GetById (@PathVariable long id) {// retorna um unico objeto:postagem
			return repository.findById(id) //retorna a interface q foi injetada e chama o metodo findById que pode devolver um objeto do tipo postagem (ok), como um not foud caso esse objeto nao exista ou exista erro na requisicao.
					.map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
		
		//para que o metodo possa capturar o valor do id la no caminho da url
		}
		
		@GetMapping("/titulo/{titulo}")// passa o caminho titulo, e atributo que recebe sera um titulo. A api entende que dps de uma barra, o ultimo dado n entende o nome e sim como atributo..
		public ResponseEntity<List<Postagem>>GetByTitulo(@PathVariable String titulo){
			return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
		}
		//metodo Post (insercao do dado)
		@PostMapping
		public ResponseEntity<Postagem> post (@RequestBody Postagem postagem){
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
		}
		
		//metodo Put (atualizacao do dado)
		@PutMapping
		public ResponseEntity<Postagem> put (@RequestBody Postagem postagem){
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
		}
		
		//metodo Delete
		@DeleteMapping("/{id}")
		public void delete(@PathVariable long id) { //void que n vai retornar nada, so status ok de que foi deletado
			repository.deleteById(id);
		}
}
