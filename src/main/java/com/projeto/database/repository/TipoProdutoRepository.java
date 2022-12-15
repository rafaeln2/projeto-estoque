package com.projeto.database.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.database.entities.TipoProduto;

public interface TipoProdutoRepository extends JpaRepository<TipoProduto, Integer>{

	List<TipoProduto> findByDescricaoContainingIgnoreCase(String descricao);
	
	List<TipoProduto> findByDescricao(String descricao);
}
