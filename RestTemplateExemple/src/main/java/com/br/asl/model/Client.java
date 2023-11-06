package com.br.asl.model;

import java.io.Serializable;

public class Client implements Serializable{

	private static final long serialVersionUID = 1L;

//    {
//        "cep": "01001-000",
//        "logradouro": "Praça da Sé",
//        "complemento": "lado ímpar",
//        "bairro": "Sé",
//        "localidade": "São Paulo",
//        "uf": "SP",
//        "ibge": "3550308",
//        "gia": "1004",
//        "ddd": "11",
//        "siafi": "7107"
//      }
         
    private String cep;
    
    private String logradouro;
    
    private String complemento;
    
    private String bairro;
    
    private String uf;

    private String ibge;
    
    private String gia;
	
	private String siafi;

	public Client() {
	}

	public Client(String cep, String logradouro, String complemento, String bairro, String uf, String ibge, String gia,
			String siafi) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.uf = uf;
		this.ibge = ibge;
		this.gia = gia;
		this.siafi = siafi;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getIbge() {
		return ibge;
	}

	public void setIbge(String ibge) {
		this.ibge = ibge;
	}

	public String getGia() {
		return gia;
	}

	public void setGia(String gia) {
		this.gia = gia;
	}

	public String getSiafi() {
		return siafi;
	}

	public void setSiafi(String siafi) {
		this.siafi = siafi;
	}

	@Override
	public String toString() {
		return "Client [cep= " + cep + " não é válido digite novamente]";
	}


	
}
