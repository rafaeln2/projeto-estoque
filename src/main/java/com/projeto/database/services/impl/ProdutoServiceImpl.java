package com.projeto.database.services.impl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Produto findById(Integer id) {
		Optional<Produto> produto = produtoRepository.findById(id);
		return produto.orElse(null);
	}

}
