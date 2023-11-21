package com.mochimochi.backcrudmarketing.controller;


import com.mochimochi.backcrudmarketing.model.Comentarios;
import com.mochimochi.backcrudmarketing.model.User;
import com.mochimochi.backcrudmarketing.repository.ComentariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ComentariosController {

    @Autowired
    private ComentariosRepository repository;
    @GetMapping("/api/user")
    public List<Comentarios> listaComentarios(){
        return (List<Comentarios>) repository.findAll();
    }
}
