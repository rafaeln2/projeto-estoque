package com.projeto.database.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.database.entities.Produto;
import com.projeto.database.repository.ProdutoRepository;
import com.projeto.database.services.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	@Autowired
	ProdutoRepository produtoRepository;
	
	@Override
	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}

	@Override
	public List<Produto> getProdutos() {
		return produtoRepository.findAll();
	}

}
