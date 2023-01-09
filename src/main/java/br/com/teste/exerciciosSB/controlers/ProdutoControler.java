package br.com.teste.exerciciosSB.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.exerciciosSB.model.entities.Produto;
import br.com.teste.exerciciosSB.model.repositories.ProdutoRepositorio;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoControler {
	
	@Autowired
	private ProdutoRepositorio produtoRepositorio;

	@PostMapping
	public @ResponseBody Produto novoProduto(@RequestParam String nome) {
		Produto produto = new Produto(nome);
		
		return produto;
	}
	
	
	
}
