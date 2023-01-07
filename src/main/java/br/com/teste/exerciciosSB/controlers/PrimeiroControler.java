package br.com.teste.exerciciosSB.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroControler {
	
	@GetMapping(path = {"/ola", "/sauldacao"})
	public String ola() {
		return "Ola Spring Boot!";
	}
}
