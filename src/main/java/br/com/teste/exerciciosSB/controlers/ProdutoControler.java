package br.com.teste.exerciciosSB.controlers;

import java.lang.StackWalker.Option;
import java.lang.reflect.Method;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.exerciciosSB.model.entities.Produto;
import br.com.teste.exerciciosSB.model.repositories.ProdutoRepositorio;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoControler {
	
	@Autowired
	private ProdutoRepositorio produtoRepositorio;

	//@PostMapping
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto novoProduto(@Valid Produto produto) {
		
		produtoRepositorio.save(produto);
		return produto;
	}
	
	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepositorio.findAll();
	}
	
	
	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable Integer id) {
		return produtoRepositorio.findById(id);
	}
	
	/*
	 * @PutMapping public Produto alterarProduto(@Valid Produto produto) {
	 * produtoRepositorio.save(produto); return produto; }
	 */
	
	
	@DeleteMapping(path = "/{id}")
	public void excluirPorduto(@PathVariable Integer id) {
		produtoRepositorio.deleteById(id);
	}
}
