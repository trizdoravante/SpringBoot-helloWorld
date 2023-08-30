package com.alunageneration.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping ("/HelloWorld")
public class HelloWorldController {
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
		@GetMapping("/BSM")
			public String ListaBSM() {
			return "<pre>/n"+
			"Lista de BSM Generation Brasil/n"+
					"Mentalidade de Crescimento/n"+
			        "Persistência/n"+
					"Responsabilidade Pessoal/n"+
			        "Orientação ao Futuro/n"+
					"Comunicação/n"+
			        "Orientação ao Detalhe/n"+
					"Proatividade/n"+
			        "Trabalho em Equipe/n"+
					"<pre>/n";
		}
			@GetMapping("/objSemana")
				
			public String ListaSemana(){
				return "<pre>/n"+
			"Objetivos de aprendizagem da semana:/n"+
						"Revisar os conteúdos apresentados durante a semana./n"+
			            "Fazer exercícios de MySQL./n"+
						"Ler o Cookbook e fazer anotações./n"+
			            "Verificar se estou de fato em dia com todos os exercícios./n"+
						"<pre>/n";
						
			}
			
		}
	
	
	

