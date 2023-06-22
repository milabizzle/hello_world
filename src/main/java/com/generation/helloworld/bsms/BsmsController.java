package com.generation.helloworld.bsms;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsms")
public class BsmsController {
	
	@GetMapping
	public ArrayList<String> listaBSMs() {
		
		ArrayList<String> listaBSMs = new ArrayList<String>();
		
		listaBSMs.add("Responsabilidade Pessoal");
		listaBSMs.add("Mentalidade de Crescimento");
		listaBSMs.add("Orientação para o Futuro");
		listaBSMs.add("Persistância");
		listaBSMs.add("Comunicação");
		listaBSMs.add("Trabalho em equipe");
		listaBSMs.add("Proatividade");
		listaBSMs.add("Orientação ao Detalhe");
		
		return listaBSMs;
        }
        		

}
