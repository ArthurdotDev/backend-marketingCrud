package com.mochimochi.backcrudmarketing.dto;

import com.mochimochi.backcrudmarketing.model.Evento;

import java.time.Instant;

public record ComentarioDTO(String id, Instant dataComentario, String conteudoComentario, Evento evento) {

}
