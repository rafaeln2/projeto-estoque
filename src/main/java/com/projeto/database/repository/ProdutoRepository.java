package com.projeto.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.database.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
