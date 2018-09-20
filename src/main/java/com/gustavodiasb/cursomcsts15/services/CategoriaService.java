package com.gustavodiasb.cursomcsts15.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavodiasb.cursomcsts15.domain.Categoria;
import com.gustavodiasb.cursomcsts15.repositories.CategoriaRepository;


/* CAMADA DE SERVIÇO */

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
	}

}
