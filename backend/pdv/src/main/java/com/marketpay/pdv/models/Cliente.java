/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marketpay.pdv.models;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private boolean ativo;

    public Cliente(String nome, String cpf, String telefone, boolean ativo){ 
        this.nome=nome;
        this.cpf=cpf;
        this.telefone=telefone;
        this.ativo=ativo;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getTelefone(){
        return telefone;
    }

    public boolean getAtivo(){
        return ativo;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setCpf(String cpf){
        this.cpf=cpf;
    }

    public void setTelefone(String telefone){
        this.telefone=telefone;
    }

    public void setAtivo(boolean ativo){
        this.ativo=ativo;
    }
}
