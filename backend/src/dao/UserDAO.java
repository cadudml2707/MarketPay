package dao;

import classes.User;
import java.util.List;
import java.util.ArrayList;

public class UserDAO {
    
    private List<User> users = new ArrayList<>();

    public void novoUser(String nome, String email, String senha){
        User user = new User(nome, email, senha);
        users.add(user);
    }

    public void buscaruser(String email, String senha){
        for(User user : users){
            if(email == user.getEmail() && senha == user.getSenha()){
                user.getNome();
                user.getEmail();
                user.getSenha();
            }
        }
    }

    public void atualizarUser(String nome, String email, String senha){
        for(User user : users){
            if(email == user.getEmail() && senha == user.getSenha()){
                user.setNome(nome);
                user.setEmail(email);
                user.setSenha(senha);
            }
        }
    }

    public void deletarUser(String email, String senha){
        users.removeIf(user -> user.getEmail() == email && user.getSenha() == senha);
    }
    
}
