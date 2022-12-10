package com.projeto.database.entities.mapper;

import org.springframework.stereotype.Service;

import com.projeto.database.entities.Produto;
import com.projeto.database.entities.dto.ProdutoDTO;

@Service
public class ProdutoMapper {

	public Produto mapProdutoDTOtoProduto(ProdutoDTO dto) {	
		Produto produto = new Produto(dto.getTipoProduto(), dto.getDescricao(), dto.getQuantidade());
		
		return produto;
	}
	
}
