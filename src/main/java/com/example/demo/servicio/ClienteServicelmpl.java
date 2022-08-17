package com.example.demo.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cliente;
import com.example.demo.repositorio.ClienteRepository;
@Service
public class ClienteServicelmpl  implements ClienteService{
	
	@Autowired
	private ClienteRepository repository;

	@Override
	public void guardarCliente(Cliente clientes) {
		repository.save(clientes);
		
	}

	@Override
	public void actulizarCliente(Cliente clientes) {
		repository.saveAndFlush(clientes);
		
	}

	@Override
	public void eliminarCliente(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<Cliente> listarCliente() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cliente obtenerClientesId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}


}
