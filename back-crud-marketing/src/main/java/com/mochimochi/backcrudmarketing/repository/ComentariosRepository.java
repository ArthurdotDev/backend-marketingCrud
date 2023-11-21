package com.mochimochi.backcrudmarketing.repository;

import com.mochimochi.backcrudmarketing.model.Comentarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentariosRepository  extends JpaRepository<Comentarios, Long> {
}
