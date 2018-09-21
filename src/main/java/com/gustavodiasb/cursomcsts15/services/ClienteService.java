package com.gustavodiasb.cursomcsts15.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gustavodiasb.cursomcsts15.domain.Cliente;
import com.gustavodiasb.cursomcsts15.repositories.ClienteRepository;
import com.gustavodiasb.cursomcsts15.services.exceptions.ObjectNotFoundException;


/* CAMADA DE SERVIÇO */

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Cliente obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Cliente.class.getName());
		}
		return obj;
	}

}
