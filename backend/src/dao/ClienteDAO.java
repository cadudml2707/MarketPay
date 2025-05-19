package dao;

import java.util.List;

import controllers.Cliente;

import java.util.ArrayList;

public class ClienteDAO {
    
    List<Cliente> clientes = new ArrayList<>();

    public void novoCliente(String nome, String cpf, String telefone){
        Cliente cliente = new Cliente(nome, cpf, telefone);
        clientes.add(cliente);
    }

    public void buscarCliente(String cpf){
        for(Cliente cliente : clientes){
            if(cliente.getCpf() == cpf){
                cliente.getNome();
                cliente.getCpf();
                cliente.getTelefone();
            }
        }
    }

    public void atualizarCliente(String nome, String cpf, String telefone){
        for(Cliente cliente : clientes){
            if(cliente.getCpf() == cpf){
                cliente.setNome(nome);
                cliente.setCpf(cpf);
                cliente.setTelefone(telefone);
            }
        }
    }

    public void deletarCliente(String nome, String cpf, String telefone){
        clientes.removeIf(cliente -> cliente.getCpf() == cpf);
    }
}
