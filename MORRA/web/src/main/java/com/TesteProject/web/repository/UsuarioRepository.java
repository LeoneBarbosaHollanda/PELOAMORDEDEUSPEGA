package com.TesteProject.web.repository;

import com.TesteProject.web.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Integer > {
}
