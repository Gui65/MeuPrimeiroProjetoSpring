package br.com.primeiroProjeto.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.primeiroProjeto.demo.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
