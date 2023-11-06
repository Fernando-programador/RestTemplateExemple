package com.br.asl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.asl.model.Client;
import com.br.asl.service.ClientServiceImpl;

@RestController
@RequestMapping("/cep")
public class ClientController {
	
	@Autowired
	private ClientServiceImpl service;
	
	@GetMapping(value = "/{cep}")
	public ResponseEntity<Client> findAll(@PathVariable ("cep") String cep){
		
		var resp = service.findAll(cep);
		return new ResponseEntity<>(resp, HttpStatus.OK);
	}
	

}
