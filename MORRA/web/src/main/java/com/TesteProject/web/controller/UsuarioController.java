package com.TesteProject.web.controller;


import com.TesteProject.web.model.Usuario;
import com.TesteProject.web.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController(value ="/usucontroller")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario){

        System.out.print(usuario);
        return usuarioRepository.save(usuario);
    }
}
