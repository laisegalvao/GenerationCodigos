package com.lojade.lojaeletro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lojade.lojaeletro.model.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto, Long> {

	@Query(value = "select * from tb_produto where preco > :valor1 and preco < :valor2", nativeQuery = true)
	public List<Produto> maiorQueMenorQue(@Param("valor1") float valor1, @Param("valor2" ) float valor2);
	
	//@Query(valeu = "select * from tb_produto inner join tb_tipoeletro on tb_produto.id = tb_tipoeletro.id 
	//where tb_tipoeletro.descricao like: descricao% and tb_produto.valor <= valor", nativequery)
	//public List<Produto> menorValor(@Param("descricao") String descricao, @Param("valor" ) float valor;
	
}
