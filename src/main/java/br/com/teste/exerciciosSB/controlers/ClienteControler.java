package br.com.teste.exerciciosSB.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.exerciciosSB.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteControler {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Paulo", "123.456.789-00");
				
	}
	
}
