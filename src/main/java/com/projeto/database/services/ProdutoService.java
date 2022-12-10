package com.projeto.database.services;

import java.util.List;

import com.projeto.database.entities.Produto;

public interface ProdutoService {
	
	public List<Produto> getProdutos();
	
	public Produto save(Produto produto);
	
}