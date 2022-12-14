package com.projeto.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projeto.database.entities.Produto;
import com.projeto.database.entities.TipoProduto;
import com.projeto.database.services.ProdutoService;
import com.projeto.database.services.TipoProdutoService;

@SpringBootApplication
public class ProjetoEstoqueApplication implements CommandLineRunner {

	@Autowired
	ProdutoService produtoService;

	@Autowired
	TipoProdutoService tipoProdutoService;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoEstoqueApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Produto produto1 = new Produto();
		produto1.setDescricao("descrição produto");
		produto1.setQuantidade(3);
		
		Produto produto2 = new Produto();
		produto1.setDescricao("descricao 2");
		produto1.setQuantidade(6);
		
		TipoProduto tipoProduto1 = new TipoProduto();
		tipoProduto1.setDescricao("Eletronico");
		tipoProdutoService.save(tipoProduto1);
		
		TipoProduto tipoProduto2 = new TipoProduto();
		tipoProduto2.setDescricao("Moveis");
		tipoProdutoService.save(tipoProduto2);
		
				
		produto1.setTipoProduto(tipoProduto1);
		produto2.setTipoProduto(tipoProduto2);
		produtoService.save(produto1);
		produtoService.save(produto2);
		
	}

}
