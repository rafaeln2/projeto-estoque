package com.projeto.database.entities.dto;

import java.io.Serializable;

import com.projeto.database.entities.TipoProduto;

public class ProdutoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private TipoProduto tipoProduto;

	private String descricao;

	private Integer quantidade;

	public ProdutoDTO() {
		super();
	}

	public ProdutoDTO(Integer id, TipoProduto tipoProduto, String descricao, Integer quantidade) {
		super();
		this.id = id;
		this.tipoProduto = tipoProduto;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
