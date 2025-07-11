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
    private boolean ativo;

    public User(String nome, String email, String senha, String tipo, boolean ativo){
        this.nome=nome;
        this.email=email;
        this.senha=senha;
        this.tipo=tipo;
        this.ativo=ativo;
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

    public boolean getAtivo(){
        return ativo;
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

    public void setAtivo(boolean ativo){
        this.ativo=ativo;
    }
}
