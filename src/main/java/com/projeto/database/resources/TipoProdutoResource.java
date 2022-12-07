package com.projeto.database.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.database.entities.TipoProduto;
import com.projeto.database.services.TipoProdutoService;

@RestController
@RequestMapping("/tipoProduto")
public class TipoProdutoResource {

	@Autowired
	private TipoProdutoService tipoProdutoService;

	@GetMapping()
	public ResponseEntity<List<TipoProduto>> getTipoProdutos() {
		List<TipoProduto> lista = tipoProdutoService.getTiposProduto();
		return ResponseEntity.ok().body(lista);
	}

	@PostMapping("/salva")
	public ResponseEntity<TipoProduto> saveTipoProduto(@RequestBody TipoProduto tipoProduto) throws URISyntaxException {
		TipoProduto novoTipoProduto = tipoProdutoService.save(tipoProduto);
		return ResponseEntity.created(new URI("/tipoProduto/salva/" + novoTipoProduto.getId())).body(novoTipoProduto);
	}

}
