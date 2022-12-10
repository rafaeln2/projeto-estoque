package com.projeto.database.entities.mapper;

import org.springframework.stereotype.Service;

import com.projeto.database.entities.TipoProduto;
import com.projeto.database.entities.dto.TipoProdutoDTO;

@Service
public class TipoProdutoMapper {

	public TipoProduto mapTipoProdutoDTOtoTipoProduto(TipoProdutoDTO dto) {
		
		TipoProduto tipoProduto = new TipoProduto(dto.getDescricao());
		return tipoProduto;
	}
}
