package io.github.cursospringboot.produtosapi.repository;

import io.github.cursospringboot.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
