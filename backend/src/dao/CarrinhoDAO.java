package dao;

import java.util.ArrayList;
import java.util.List;

import model.ProdutoCarrinho;

public class CarrinhoDAO {
    
    List<ProdutoCarrinho> carrinho = new ArrayList<>();

    public void adicionarProduto(String nome, int codigo, float preco, int quantidade){
        ProdutoCarrinho p = new ProdutoCarrinho(nome, codigo, preco, quantidade);
        carrinho.add(p);
    }
}
