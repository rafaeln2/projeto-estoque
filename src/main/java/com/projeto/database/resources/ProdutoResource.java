package com.projeto.database.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.database.entities.Produto;
import com.projeto.database.entities.dto.ProdutoDTO;
import com.projeto.database.entities.mapper.ProdutoMapper;
import com.projeto.database.services.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private ProdutoMapper mapper;

	@GetMapping()
	public ResponseEntity<List<Produto>> getProdutos() {
		List<Produto> lista = produtoService.getProdutos();
		return ResponseEntity.ok().body(lista);
	}

	@PostMapping("/salva")
	public ResponseEntity<Produto> saveProduto(
			@Valid @RequestBody ProdutoDTO dto) throws URISyntaxException {
		
		Produto novoProduto = produtoService.save(mapper.mapProdutoDTOtoProduto(dto));
		return ResponseEntity.created(new URI("/Produto/salva/" + novoProduto.getId()))
				.body(novoProduto);
	}
}
