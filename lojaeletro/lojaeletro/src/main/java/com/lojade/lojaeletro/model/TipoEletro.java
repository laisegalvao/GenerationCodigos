package com.lojade.lojaeletro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_eletro")
public class TipoEletro {
	
	//atributos: id, descricao, ativo.
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	private long id;
	
	
	@Size(min = 3, max = 250)
	private String descricao;
	
	
	private boolean ativo;
	
	@OneToMany (mappedBy = "tipoeletro", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("tipoeletro")
	private List<Produto> produtos;
	
	//criacao de sets e gets
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
}
