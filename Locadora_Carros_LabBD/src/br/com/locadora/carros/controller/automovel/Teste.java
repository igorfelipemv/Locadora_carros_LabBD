package br.com.locadora.carros.controller.automovel;

import java.sql.SQLException;

import br.com.locadora.caros.model.Cliente;
import br.com.locadora.carros.persistence.ClienteDAO;

public class Teste {
	public static void main (String [] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("teste1");
		cliente.setSobrenome("teste1");
		cliente.setRg("1234");
		cliente.setCpf("12345");
		cliente.setTelefone("123456");
		
		System.out.println("AEEE: "+cliente.getNome());
		try {
			ClienteDAO clienteDao = new ClienteDAO();
			clienteDao.insertCliente(cliente);
			System.out.println("Id Retorno do SQL: "+cliente.getId());
			
		} catch (SQLException | ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
