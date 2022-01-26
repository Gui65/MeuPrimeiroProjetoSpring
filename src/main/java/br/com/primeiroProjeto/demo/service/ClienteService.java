package br.com.primeiroProjeto.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import br.com.primeiroProjeto.demo.model.Cliente;
import br.com.primeiroProjeto.demo.repository.ClienteRepository;
import br.com.primeiroProjeto.exception.ResourceNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente create(Cliente c) {
		return clienteRepository.save(c);
	}
	
	public Cliente update(Cliente c, Long id) throws ResourceNotFoundException {
		Cliente found =  clienteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Cliente nao encontrado"));
		found.setEmail(c.getEmail());
		found.setNomeCliente(c.getNomeCliente());
		found.setDataNascimento(c.getDataNascimento());
		found.setProdutos(c.getProdutos());
		return clienteRepository.save(c);
	}
}
