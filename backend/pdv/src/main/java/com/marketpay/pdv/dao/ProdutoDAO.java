/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marketpay.pdv.dao;

import com.marketpay.pdv.models.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grupobringel
 */
public class ProdutoDAO {
    protected List<Produto> estoque = new ArrayList<>();

    public void novoProduto(String nome, int codigo, float preco, int quantidade) {
        Produto produto = new Produto(nome, codigo, preco, quantidade);
        estoque.add(produto);
    }
    
    public void verProdutos(){ 
        for(Produto produto : estoque){
            produto.getCodigo();
            produto.getNome();
            produto.getPreco();
            produto.getQuantidade();
        }
    }

    public void atualizarProduto(String nome, int codigo, float preco, int quantidade){
        for(Produto produto : estoque){
            if(produto.getCodigo() == codigo){
                produto.setNome(nome);
                produto.setPreco(preco);
                produto.setQuantidade(quantidade);
            }
        }
    }

    public void deletarProduto(int codigo){
        estoque.removeIf(produto -> produto.getCodigo() == codigo);
    }
}
