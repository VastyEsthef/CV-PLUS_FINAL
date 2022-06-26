package com.example.repository;

import com.example.entities.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findByUsername(String username);
}
