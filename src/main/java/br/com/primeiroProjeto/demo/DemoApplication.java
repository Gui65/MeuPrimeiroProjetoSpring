package br.com.primeiroProjeto.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.primeiroProjeto.demo.model.Cliente;
import br.com.primeiroProjeto.demo.model.Produto;
import br.com.primeiroProjeto.demo.repository.ClienteRepository;
import br.com.primeiroProjeto.demo.repository.ProdutoRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	
	//private ProdutoService produtoService;
	@Autowired
	private ProdutoRepository produtoRepository;

	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Produto produto = new Produto("Maça", 400);
		
		//Cadastrando o produto
		produtoRepository.save(produto);
		
	}

}
