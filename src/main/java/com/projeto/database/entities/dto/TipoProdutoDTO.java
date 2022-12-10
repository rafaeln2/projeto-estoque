package com.projeto.database.entities.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class TipoProdutoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;

	@NotEmpty(message = "Descrição está vazia")
	@NotBlank
	private String descricao;

	public TipoProdutoDTO() {
		super();
	}

	public TipoProdutoDTO(Integer id, String descricao) {
		super();
		this.id = id;
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
