package com.br.asl.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.br.asl.model.Client;

@Service
public interface ClientService {

	
	public Client findAll(@ PathVariable("cep") String cep);
}
