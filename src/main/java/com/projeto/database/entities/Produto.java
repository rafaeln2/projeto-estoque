package com.projeto.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(generator = "produto_generator", strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "tipo_produto")
	private TipoProduto tipoProduto;

	@Column(name = "produto_descricao")
	private String descricao;

	@Column(name = "produto_quantidade")
	private Integer quantidade;

	public Produto() {
		super();
	}
	
	public Produto(TipoProduto tipoProduto, String descricao, Integer quantidade) {
		super();
		this.tipoProduto = tipoProduto;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}

	public Produto(Integer id, TipoProduto tipoProduto, String descricao, Integer quantidade) {
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
