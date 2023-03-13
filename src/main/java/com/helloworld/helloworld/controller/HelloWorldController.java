package com.helloworld.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController{
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";

	}

	@GetMapping ("/bsms")
	public List<String> mostrar() {
		ArrayList<String> listaBsm = new ArrayList<String>();
		listaBsm.add("Persistência");
		listaBsm.add("Mentalidade de Crescimento");
		listaBsm.add("Responsabilidade Pessoal");
		listaBsm.add("Orientação ao Futuro");
		listaBsm.add("Comunicação");
		listaBsm.add("Trabalho em Equipe");
		listaBsm.add("Orientação ao Detalhe");
		listaBsm.add("Proatividade");
		return listaBsm;
		}
	@GetMapping ("/objetivos")
	public List<String> mostrar2() {
		ArrayList<String> listaObjetivos = new ArrayList<String>();
		listaObjetivos.add("Aprender sobre Spring Boot");
		listaObjetivos.add("Fazer meu primeiro projeto em Spring Boot");
		listaObjetivos.add("Inserir esse conhecimento no Projeto Integrador");
		return listaObjetivos;
		}
}


