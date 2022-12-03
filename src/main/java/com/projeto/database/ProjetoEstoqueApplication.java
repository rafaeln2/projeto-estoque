package com.projeto.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projeto.database.entities.Produto;
import com.projeto.database.entities.TipoProduto;
import com.projeto.database.repository.ProdutoRepository;
import com.projeto.database.repository.TipoProdutoRepository;

@SpringBootApplication
public class ProjetoEstoqueApplication implements CommandLineRunner {

	@Autowired
	ProdutoRepository produtoRepository;

	@Autowired
	TipoProdutoRepository tipoProdutoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoEstoqueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Produto produto1 = new Produto();
		produto1.setDescricao("descrição produto");
		produto1.setQuantidade(3);
		TipoProduto tipoProduto1 = new TipoProduto();
		tipoProduto1.setDescricao("Eletronico");
		tipoProdutoRepository.save(tipoProduto1);
		produto1.setTipoProduto(tipoProduto1);

		produtoRepository.save(produto1);

	}

}
