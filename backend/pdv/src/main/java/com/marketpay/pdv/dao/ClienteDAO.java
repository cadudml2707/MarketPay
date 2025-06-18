/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marketpay.pdv.dao;
import java.util.List;
import com.marketpay.pdv.models.Cliente;
import java.util.ArrayList;

/**
 *
 * @author grupobringel
 */
public class ClienteDAO {
    protected List<Cliente> clientes = new ArrayList<>();

    public void novoCliente(String nome, String cpf, String telefone){ 
        Cliente cliente = new Cliente(nome, cpf, telefone);
        clientes.add(cliente);
    }

    public void verClientes(){
        for(Cliente cliente : clientes){
            cliente.getCpf();
            cliente.getNome();
            cliente.getCpf();
            cliente.getTelefone();
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
