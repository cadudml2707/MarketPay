package dao;

import java.util.List;

import model.User;

import java.util.ArrayList;

public class UserDAO {
    
    protected static List<User> users = new ArrayList<>();

    public static void novoUser(String nome, String email, String senha, String tipo){
        User user = new User(nome, email, senha, tipo);
        users.add(user);
    }

    public void verUsers(){
        for(User user : users){
            user.getNome();
            user.getEmail();
            user.getSenha();
            user.getTipo();
        }
    }
    
    public void atualizarUser(String nome, String email, String senha, String tipo){
        for(User user : users){
            if(email == user.getEmail() && senha == user.getSenha()){
                user.setNome(nome);
                user.setEmail(email);
                user.setSenha(senha);
                user.setTipo(tipo);
            }
        }
    }

    public void deletarUser(String email, String senha){
        users.removeIf(user -> user.getEmail() == email && user.getSenha() == senha);
    }
    
}
