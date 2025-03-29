package dao;

import classes.Produto;
import java.util.List;
import java.util.ArrayList;

public class ProdutoDAO {
    
    private List<Produto> produtos = new ArrayList<>();

    public void novoProduto(String nome, int codigo, float preco, int quantidade) {
        Produto produto = new Produto(nome, codigo, preco, quantidade);
        produtos.add(produto);
    }

    public void buscarProduto(int codigo){
        for(Produto produto : produtos){
            if(produto.getCodigo() == codigo){
                produto.getNome();
                produto.getPreco();
                produto.getQuantidade();
            }
        }
    }

    public void atualizarProduto(String nome, int codigo, float preco, int quantidade){
        for(Produto produto : produtos){
            if(produto.getCodigo() == codigo){
                produto.setNome(nome);
                produto.setPreco(preco);
                produto.setQuantidade(quantidade);
            }
        }
    }

    public void deletarProduto(int codigo){
        produtos.removeIf(produto -> produto.getCodigo() == codigo);
    }

}
