package br.com.teste.exerciciosSB.model.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank
	private String nome;
	
	@Min(0)
	private Double precoNormal;
	
	@Min(0)
	@Max(1)
	private Double desconto;
	
	public Produto() {
		
	}

	

	public Produto(String nome, Double precoNormal, Double precoComDesconto) {
		super();
		this.nome = nome;
		this.precoNormal = precoNormal;
		this.desconto = precoComDesconto;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrecoNormal() {
		return precoNormal;
	}

	public void setPrecoNormal(Double precoNormal) {
		this.precoNormal = precoNormal;
	}

	public Double getPrecoComDesconto() {
		return desconto;
	}

	public void setPrecoComDesconto(Double precoComDesconto) {
		this.desconto = precoComDesconto;
	}

	
	
}
