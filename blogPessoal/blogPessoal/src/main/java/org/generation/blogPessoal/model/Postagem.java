package org.generation.blogPessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity //indica q essa classe sera uma entidade do jpa
@Table(name = "postagem")//essa entidade dentro do banco de dados vai virar uma tabela e seu nome sera postagem
public class Postagem {
	 
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) //significa que ira se transformar em uma chave primaria no banco de dados.
	private long id;
	
	@NotNull //nao pode vir titulo vazio
	@Size (min = 5, max = 100) //quantidade de caracter q o cliente consegue enviar p gente como titulo. min e max sao os parametros, min e max de caracteres
	private String titulo;
	
	@NotNull 
	@Size (min = 10, max = 500)
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP) //p indicar que esta trabalhando com o tempo
	private Date data = new java.sql.Date(System.currentTimeMillis()); //esse metodo java. pq assim q passar algum dado por essa classe ja indica 
										//a data, hora, min, segundo..
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	

	
}
