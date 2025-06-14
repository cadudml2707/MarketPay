package model;

public class Cliente {
    
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente(String nome, String cpf, String telefone){
        this.nome=nome;
        this.cpf=cpf;
        this.telefone=telefone;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setCpf(String cpf){
        this.cpf=cpf;
    }

    public void setTelefone(String telefone){
        this.telefone=telefone;
    }
}
