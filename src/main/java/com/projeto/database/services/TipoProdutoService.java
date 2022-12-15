package com.projeto.database.services;

import java.util.List;

import com.projeto.database.entities.TipoProduto;

public interface TipoProdutoService {

	public List<TipoProduto> getTiposProduto();
	
	public TipoProduto save(TipoProduto tipoProduto);
	
	public TipoProduto findById(Integer id);
	
	public List<TipoProduto> findByDescricaoContainingIgnoreCase(String descricao);
}
