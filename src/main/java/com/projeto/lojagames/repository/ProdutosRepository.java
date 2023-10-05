package com.projeto.lojagames.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.projeto.lojagames.model.Produtos;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {

	
}
