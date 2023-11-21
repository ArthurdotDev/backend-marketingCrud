package com.mochimochi.backcrudmarketing.model;

import jakarta.persistence.*;

import lombok.Data;

import java.time.Instant;

@Data
@Entity(name ="comentarios")
@Table(name = "comentarios")
public class Comentarios {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private Instant dataComentario = Instant.now();

    private String conteudoComentario;

    @ManyToOne
    @JoinColumn(name ="evento_id")
    private Evento evento;




}
