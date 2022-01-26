package br.com.primeiroProjeto.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.primeiroProjeto.demo.model.Cliente;
import br.com.primeiroProjeto.demo.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente create(Cliente c) {
		return clienteRepository.save(c);
	}
}
