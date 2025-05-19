package controllers;

public class Produto {
    
    private String nome;
    private int codigo;
    private float preco;
    private int quantidade;

    public Produto(String nome, int codigo, float preco, int quantidade){
        this.nome=nome;
        this.codigo=codigo;
        this.preco=preco;
        this.quantidade=quantidade;
    }

    public String getNome(){
        return nome;
    }

    public int getCodigo(){
        return codigo;
    }

    public float getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public void setPreco(float preco){
        this.preco=preco;
    }

    public void setQuantidade(int quantidade){
        this.quantidade=quantidade;
    }
}
