package model;

import java.time.LocalDateTime;

public class Venda {
    
    private int id;
    private LocalDateTime dataCompra;
    private float total;
    private int qtd_itens;
    private Cliente cliente;
    private User user;

    public Venda(int id, LocalDateTime dataCompra, float total, int qtd_itens, Cliente cliente, User user){
        this.id=id;
        this.dataCompra=dataCompra;
        this.total=total;
        this.qtd_itens=qtd_itens;
        this.cliente=cliente;
        this.user=user;
    }

    public int getId(){
        return id;
    }

    public LocalDateTime getData(){
        return dataCompra;
    }

    public float getTotal(){
        return total;
    }

    public int getQtdItens(){
        return qtd_itens;
    }

    public String getCliente(){
        return cliente.getCpf();
    }

    public String getUser(){
        return user.getEmail();
    }

    public void setId(int id){
        this.id=id;
    }

    public void setTotal(float total){
        this.total=total;
    }

    public void setQtdItens(int qtd_itens){
        this.qtd_itens=qtd_itens;
    }
}
