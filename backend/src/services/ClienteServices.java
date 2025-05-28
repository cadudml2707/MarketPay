package services;

import dao.ClienteDAO;
import model.Cliente;

public class ClienteServices extends ClienteDAO {
    
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
    }
}
