package dao;

import java.util.List;

import model.Produto;

import java.util.ArrayList;

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
