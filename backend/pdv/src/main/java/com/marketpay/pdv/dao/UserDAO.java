/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marketpay.pdv.dao;

import com.marketpay.pdv.models.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grupobringel
 */
public class UserDAO {
    protected static List<User> users = new ArrayList<>();

    public static void novoUser(String nome, String email, String senha, String tipo, boolean ativo){
        User user = new User(nome, email, senha, tipo, ativo);
        users.add(user);
    }

    public void verUsers(){
        for(User user : users){
            user.getNome();
            user.getEmail();
            user.getSenha();
            user.getTipo();
            user.getAtivo();
        }
    }
    
    public void atualizarUser(String nome, String email, String senha, String tipo, boolean ativo){
        for(User user : users){
            if(email == user.getEmail() && senha == user.getSenha()){
                user.setNome(nome);
                user.setEmail(email);
                user.setSenha(senha);
                user.setTipo(tipo);
                user.setAtivo(ativo);
            }
        }
    }

    public void deletarUser(String email, String senha){
        users.removeIf(user -> user.getEmail() == email && user.getSenha() == senha);
    }
}
