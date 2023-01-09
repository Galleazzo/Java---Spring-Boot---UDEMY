package br.com.teste.exerciciosSB.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.teste.exerciciosSB.model.entities.Produto;

public interface ProdutoRepositorio extends CrudRepository<Produto, Integer>{

	
	
}
