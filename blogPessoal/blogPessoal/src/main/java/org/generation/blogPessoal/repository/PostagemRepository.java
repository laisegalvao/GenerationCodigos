package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //para indicar p o Spring q essa classe é de repositorio
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
											//Jpa é uma outra interface, ai passa os parametros da interface que estamos criando dentro dos<>
	                                        //Parametro Postagem que é a identidade (do model que fizemos) que estamos trabalhando e a tipagem do id que é long em seu tipo primitivo (letra maiscula)
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
	//dentro dessa outra interface Jpa temos diversos contratos(que permite fazer manipulações dentro do banco de dados), dentre eles o 
	//findAll(q serve p selecionar tudo), o FindById(que seleciona um dado pelo ID), o Save(que serve p salvar) e delete p deletar
	//mas existem algumas alteracoes que nao temos dentro dessa interface(jpa) e por isso 
	//atraves dos metodos Query iremos utilizar esse conceito p fazer as consultas padronizadas, ou seja,
	//que nws mesmos iremos construir!! Exemplo desse metodo QUERY foi a constucao da List (linha 13)
	
	//construiu uma public list... que significa consulta pelo titulo da postagem
    // find é o metodo q vai ser exatamente o que ela fazo parametro é o titulo uma String... lista importa do java.util
    //(buscar todos pelo titulo, esse titulo é o nome do atributo la da entidade, containing(tudo que conter os caracteres q tem dentro da variavel vai trazer
	// parece o like do mysql.

}

