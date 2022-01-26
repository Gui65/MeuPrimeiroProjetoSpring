package br.com.primeiroProjeto.demo.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_CLIENTE")
@SequenceGenerator(name = "cliente", allocationSize = 1, sequenceName = "sq_name")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "cliente")
	@Column(name = "cd_produto")
	private Long id;

	@Column(name = "nm_cliente")
	private String nomeCliente;

	@Column(name = "ds_cliente")
	private String email;

	@Column(name = "dt_cliente")
	@Temporal(TemporalType.DATE)
	private Calendar dataNascimento;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Produto> produtos;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Endereco endereco;

	public Cliente() {
	}

	public Cliente(String nomeCliente, String email, Calendar dataNascimento, List<Produto> produtos, Endereco endereco) {
		super();
		this.nomeCliente = nomeCliente;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.produtos = produtos;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
