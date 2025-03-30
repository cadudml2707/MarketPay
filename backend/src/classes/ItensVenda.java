package classes;

public class ItensVenda {

    private int id;
    private int qtdItens;
    private float total;

    public ItensVenda(int id, int qtdItens, float total){
        this.id=id;
        this.qtdItens=qtdItens;
        this.total=total;
    }

    public int getId(){
        return id;
    }

    public int getQtdItens(){
        return qtdItens;
    }

    public float getTotal(){
        return total;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setQtdItens(int qtdItens){
        this.qtdItens=qtdItens;
    }

    public void setTotal(float total){
        this.total=total;
    }
}
