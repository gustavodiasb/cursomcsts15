package com.gustavodiasb.cursomcsts15.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavodiasb.cursomcsts15.domain.Estado;

/* CAMADA DE ACESSO A DADOS (REPOSITORY) */

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
