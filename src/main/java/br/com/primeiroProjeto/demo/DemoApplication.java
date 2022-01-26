package br.com.primeiroProjeto.demo;

import java.util.Arrays;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.primeiroProjeto.demo.model.Cliente;
import br.com.primeiroProjeto.demo.model.Endereco;
import br.com.primeiroProjeto.demo.model.Produto;
import br.com.primeiroProjeto.demo.service.ClienteService;
import br.com.primeiroProjeto.demo.service.EnderecoService;
import br.com.primeiroProjeto.demo.service.ProdutoService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	// private ProdutoService produtoService;
	@Autowired
	private ProdutoService produtoService;

	@Autowired
	private ClienteService clienteService;

	@Autowired
	private EnderecoService enderecoService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Produto produto = new Produto("Maça", 400);
		Produto produto2 = new Produto("Banana", 100);
		Produto produto3 = new Produto("Limão", 200);

		Endereco endereco = new Endereco("Rua X", "São Gabriel", "São Paulo");

		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(2002, 12, 29);
		Cliente cliente = new Cliente("Guilherme Matos", "guilhermematos851@gmail.com", dataNascimento,
				Arrays.asList(produto, produto2, produto3), endereco);
		
		produto.setCliente(cliente);
		produto2.setCliente(cliente);
		produto3.setCliente(cliente);
		
		clienteService.create(cliente);

//		Cadastrando o produto
//		produtoRepository.save(produto);

	}

}
