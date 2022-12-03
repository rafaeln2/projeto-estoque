package com.projeto.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_produto")
public class TipoProduto {

	@Id
	@GeneratedValue(generator = "tipo_produto_generator", strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "tipo_produto_descricao")
	private String descricao;

	public TipoProduto() {
		super();
	}

	public TipoProduto(String descricao) {
		super();
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
