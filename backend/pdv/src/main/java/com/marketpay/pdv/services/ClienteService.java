/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marketpay.pdv.services;

import com.marketpay.pdv.models.Cliente;
import com.marketpay.pdv.dao.ClienteDAO;

public class ClienteService extends ClienteDAO {
    
    public void cadastrarCliente(String nome, String cpf, String telefone){
        if(nome == null || cpf == null || telefone == null){
            System.out.println("Valores nulos");
            return;
        }
        for(Cliente cliente : clientes){
            if(cliente.getCpf().equals(cpf)){
                System.out.println("Cpf já cadastrado no sistema!");
                return;
            }
        }
        novoCliente(nome, cpf, telefone);
    }

    public void visualizarClientes(){
        verClientes();
    }

    public void atualizarCliente(){
        
    }
}
