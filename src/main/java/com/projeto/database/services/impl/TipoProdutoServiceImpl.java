package com.projeto.database.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.database.entities.TipoProduto;
import com.projeto.database.repository.TipoProdutoRepository;
import com.projeto.database.services.TipoProdutoService;

@Service
public class TipoProdutoServiceImpl implements TipoProdutoService {

	@Autowired
	TipoProdutoRepository tipoProdutoRepository;

	@Override
	public List<TipoProduto> getTiposProduto() {
		return tipoProdutoRepository.findAll();
	}

	@Override
	public TipoProduto save(TipoProduto tipoProduto) {
		return tipoProdutoRepository.save(tipoProduto);
	}

	@Override
	public TipoProduto findById(Integer id) {
		Optional<TipoProduto> tipoProduto = tipoProdutoRepository.findById(id);
		return tipoProduto.orElse(null);
	}

	@Override
	public List<TipoProduto> findByDescricaoContainingIgnoreCase(String descricao) {
		return tipoProdutoRepository.findByDescricaoContainingIgnoreCase(descricao);
	}

}
