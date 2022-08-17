package com.example.demo.servicio;

import java.util.List;

import com.example.demo.model.Cliente;

public interface ClienteService {
	
	void guardarCliente(Cliente clientes);
	void actulizarCliente(Cliente clientes);
	void eliminarCliente(Integer id);
	List<Cliente> listarCliente();
	Cliente obtenerClientesId(Integer id);


}
