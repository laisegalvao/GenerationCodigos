package com.farmacia.pharma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.farmacia.pharma.model.Farmacia;


@Repository
public interface FarmaciaRepository extends JpaRepository<Farmacia, Long>{
	
	public List<Farmacia> findAllByProdutoContainingIgnoreCase (String produto);
	
}
