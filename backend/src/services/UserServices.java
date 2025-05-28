package services;

import dao.UserDAO;
import model.User;

public class UserServices extends UserDAO {

    public void cadastrarUser(String nome, String email, String senha, String tipo){
        if(nome == null || email == null || senha == null || tipo == null){
            System.out.println("Erro: Nenhum campo pode ser nulo!");
            return;
        }
        for(User user : users){
            if(user.getEmail().equals(email)){
                System.out.println("Erro: Este email já está cadastrado no sistema.");
                return;
            }
        }
        if(!tipo.equals(tipo) || !tipo.equals(tipo)){
            System.out.println("Erro: Tipo inválido de Usuário!");
            return;
        }
        novoUser(nome, email, senha, tipo);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void visualizarUser(String email, String senha){
        verUsers();
    }
    
    public void atualizaUser(String nome, String email, String senha, String tipo){
        if(nome == null || email == null || senha == null || tipo == null){
            System.out.println("Erro: Nenhum campo pode ser nulo!");
            return;
        }
        for(User user : users){
            if(user.getEmail().equals(email)){
                atualizarUser(nome, email, senha, tipo);
                System.out.println("Usuário cadastrado com sucesso!");
                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    } 
    
    
}
