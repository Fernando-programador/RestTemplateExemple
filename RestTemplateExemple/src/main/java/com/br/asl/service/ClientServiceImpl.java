package com.br.asl.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.br.asl.model.Client;

@Service
public class ClientServiceImpl implements ClientService{
	
	
	
	@Override
	public Client findAll(String cep){
		RestTemplate restTemplate = new RestTemplate();
		 Client client = restTemplate.getForEntity(
				 String.format("https://viacep.com.br/ws/%s/json/", cep), Client.class).getBody();
		if (cep == null) {
			return null;
		}else {
		return client;
		}
	}




	
	}



	
	

