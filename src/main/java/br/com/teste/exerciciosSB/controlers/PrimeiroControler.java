package br.com.teste.exerciciosSB.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Sempre colocar quando for controler
public class PrimeiroControler {
	
	@GetMapping(path = "/ola") //Mapeamento para URL no navegador Hiper necessario
	public String ola() {
		return "Ola Spring Boot!";
	}
	
}
