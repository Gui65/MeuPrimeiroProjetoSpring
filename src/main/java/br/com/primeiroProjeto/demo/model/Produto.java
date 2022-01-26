package br.com.primeiroProjeto.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
@SequenceGenerator(name = "produto", allocationSize = 1, sequenceName = "sq_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "produto")
	@Column(name = "cd_produto")
	private Long id;

	@Column(name = "nm_produto")
	private String nomeString;

	@Column(name = "qtd_produto")
	private int quantidade;
	
	@ManyToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	public Produto() {
	}

	public Produto(String nomeString, int quantidade) {
		super();
		this.nomeString = nomeString;
		this.quantidade = quantidade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeString() {
		return nomeString;
	}

	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
