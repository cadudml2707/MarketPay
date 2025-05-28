package dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class VendaDAO extends ProdutoDAO {

    private List<Venda> vendas = new ArrayList<>();
    private List<ProdutoCarrinho> carrinho = new ArrayList<>();

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
