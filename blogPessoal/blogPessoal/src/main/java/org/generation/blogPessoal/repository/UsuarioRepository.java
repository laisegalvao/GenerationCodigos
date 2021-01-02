package org.generation.blogPessoal.repository;

import java.util.Optional;

import org.generation.blogPessoal.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	//metodo p pegar um usuario e um username:
	public Optional<Usuario> findByUsuario(String usuario);
	
	

}
