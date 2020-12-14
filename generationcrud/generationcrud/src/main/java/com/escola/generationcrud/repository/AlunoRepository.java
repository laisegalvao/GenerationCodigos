package com.escola.generationcrud.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.escola.generationcrud.model.Aluno;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	
	///public List<Aluno> findAllByTurmaContainingIgnoreCase (String aluno);

}
