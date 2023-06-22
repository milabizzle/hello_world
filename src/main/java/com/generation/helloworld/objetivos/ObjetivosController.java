package com.generation.helloworld.objetivos;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {

	@GetMapping
	public String[] listaObjtvsAprendizagem() {
		String vet[] = {"Me formar plenamente como DEV FullStack", "Networking", "Desenvolvimento pessoal", "Oportunidades profissionais"};
		return vet;
	
	

	}

	
	 
	 
	 
	
	
	
}
