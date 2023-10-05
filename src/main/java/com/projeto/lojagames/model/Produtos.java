package com.projeto.lojagames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "Nome do produto obrigatório")
	@Size(min = 2, max = 100, message = "Nome do produto deve conter no mínimo 02  e no máximo 100 caracteres")
	private String nomeProduto;
	
	@NotBlank(message = "Descrição do produto obrigatória")
	@Size(min = 2, max = 1000, message = "Descrição do produto deve conter no mínimo 02  e no máximo 1000 caracteres")
	private String descricaoProduto;
	
	@DecimalMin(value = "0.01", inclusive = false, message = "O preço deve ser maior que 0")
	private BigDecimal preco;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categorias categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}
	
	
	
}
