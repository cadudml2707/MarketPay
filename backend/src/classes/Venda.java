package classes;

public class Venda {
    
    private int id;
    private String dataCompra;
    private float total;
    private int qtd_itens;

    public Venda(int id, String data_compra, float total, int qtd_itens){
        this.id=id;
        this.dataCompra=data_compra;
        this.total=total;
        this.qtd_itens=qtd_itens;
    }

    public int getId(){
        return id;
    }

    public String getDataCompra(){
        return dataCompra;
    }

    public float getTotal(){
        return total;
    }

    public int getQtdItens(){
        return qtd_itens;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setDataCompra(String dataCompra){
        this.dataCompra=dataCompra;
    }

    public void setTotal(float total){
        this.total=total;
    }

    public void setQtdItens(int qtd_itens){
        this.qtd_itens=qtd_itens;
    }
}
