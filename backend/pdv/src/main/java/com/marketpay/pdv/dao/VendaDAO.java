/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.marketpay.pdv.dao;

import com.marketpay.pdv.models.Cliente;
import com.marketpay.pdv.models.Produto;
import com.marketpay.pdv.models.ProdutoCarrinho;
import com.marketpay.pdv.models.User;
import com.marketpay.pdv.models.Venda;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grupobringel
 */
public class VendaDAO extends ProdutoDAO {
    private final List<Venda> vendas = new ArrayList<>();
    private final List<ProdutoCarrinho> carrinho = new ArrayList<>();

    public void adicionarProduto(int codigo_produto) {
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo_produto) {
                ProdutoCarrinho novo = new ProdutoCarrinho(produto.getNome(), produto.getCodigo(), produto.getPreco(),
                        produto.getQuantidade());
                carrinho.add(novo);
            } 
        }
    }

    public List<ProdutoCarrinho> verCarrinho(){
        return carrinho;
    }

    public void removerProduto(int codigo) {
        carrinho.removeIf(produtoCarrinho -> produtoCarrinho.getCodigo() == codigo);
    }

    public void finalizarVenda() {
        int venda_id = vendas.size() + 1;
        LocalDateTime dataCompra = LocalDateTime.now();
        float vendaTotal = 0;
        int vendaQuantidade = 0; 

        // Objetos temporários para teste
        User user = new User("Eduardo", "teste@gmail.com", "123456", "vendedor");
        Cliente clienteNull = new Cliente("", "", "");

        for (ProdutoCarrinho produto_carrinho : carrinho) {
            for (Produto produto : estoque) {
                if (produto.getCodigo() == produto_carrinho.getCodigo()) {
                    vendaTotal += produto_carrinho.getPreco();
                    vendaQuantidade += produto_carrinho.getQuantidade();
                    ((ProdutoDAO) estoque).deletarProduto(produto_carrinho.getCodigo());
                }
            }
        }

        Venda venda = new Venda(venda_id, dataCompra, vendaTotal, vendaQuantidade, clienteNull, user);

        vendas.add(venda);
        carrinho.clear();
    }

    public void cancelarVenda() {

    }
}
