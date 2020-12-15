package com.lojade.lojaeletro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lojade.lojaeletro.model.TipoEletro;

@Repository
public interface TipoEletroRepository extends JpaRepository<TipoEletro, Long> {

}
