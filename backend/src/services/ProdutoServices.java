package services;

import dao.ProdutoDAO;
import model.Produto;

public class ProdutoServices extends ProdutoDAO {
    
    public void cadastrarProduto(String nome, float preco, int quantidade){
        if(nome == null){
            System.out.println("Erro: O nome do Produto encontra-se nulo.");
            return;
        }
        for(Produto produto : estoque){
            if(produto.getNome().equals(nome)){
                System.out.println("Produto já cadastrado no sistema!");    
                return;
            }
        }
        int codigo=0;
        for(Produto produto : estoque){
            codigo = produto.getCodigo() + 1;
        }
        novoProduto(nome, codigo, preco, quantidade);
    }

    public void visualizarProdutos(){
        verProdutos();
    }

    public void atualizaProduto(String nome, int codigo, float preco, int quantidade){
        if(nome == null){
            System.out.println("Erro: O nome do Produto encontra-se nulo.");
            return;
        }
        for(Produto produto : estoque){
            if(produto.getNome().equals(nome) && produto.getCodigo() == codigo){
                atualizarProduto(nome, codigo, preco, quantidade);
                return;
            }
        }
        System.out.println("Produto não encontrado!");
    }

    public void deletaProduto(int codigo){
        for(Produto produto : estoque){
            if(produto.getCodigo() == codigo){
                deletarProduto(codigo);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }
}
