/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marketpay.pdv.models;

/**
 *
 * @author grupobringel
 */
public class User {
    
    private String nome;
    private String email;
    private String senha;
    private String tipo;

    public User(String nome, String email, String senha, String tipo){
        this.nome=nome;
        this.email=email;
        this.senha=senha;
        this.tipo=tipo;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String getSenha(){
        return senha;
    }

    public String getTipo(){
        return tipo;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setSenha(String senha){
        this.senha=senha;
    }

    public void setTipo(String tipo){
        this.tipo=tipo;
    }
}
