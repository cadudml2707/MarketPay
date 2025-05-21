package model;
import java.util.List;

public class Carrinho {
    private int codigo;
    private Cliente cliente;
    private List<ProdutoCarrinho> itens;

    public Carrinho(int codigo, Cliente cliente){
        this.codigo=codigo;
        this.cliente=cliente;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getCliente(){
        return cliente.getCpf();
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
}
