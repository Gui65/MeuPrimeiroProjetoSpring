package br.com.primeiroProjeto.demo.service;

import org.springframework.stereotype.Service;

import br.com.primeiroProjeto.demo.model.Endereco;
import br.com.primeiroProjeto.demo.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	private EnderecoRepository enderecoRepository;
	
	public Endereco create(Endereco e) {
		return enderecoRepository.save(e);
	}
}
