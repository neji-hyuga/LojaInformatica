

public class Item {

    private String descricaoItem;
    private int numeroItem;
    private int quantidadeItem;
    private float precoItem;

    public void ImprimirDados(){
        System.out.println("Item " +descricaoItem);
        System.out.println("Número Item: "+numeroItem);
        System.out.println("Quantidade: "+quantidadeItem);
        System.out.println("Preço: "+precoItem);
        System.out.println("*****************************");
    }

    public Item (String descricaoItem, Integer numeroItem, Integer quantidadeItem, float precoItem){
        this.descricaoItem = descricaoItem;
        this.numeroItem = numeroItem;
        this.quantidadeItem = quantidadeItem;
        this.precoItem = precoItem;
        precoPositivo();
        quantidadePositiva();}

    public void quantidadePositiva() {
        if (quantidadeItem < 0){
            quantidadeItem = 0;
        } else {
            this.quantidadeItem = quantidadeItem;
        }
    }

    public void precoPositivo(){
        if (precoItem < 0){
            precoItem = 0;
        }
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public Integer getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(Integer numeroItem) {
        this.numeroItem = numeroItem;
    }

    public Integer getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(Integer quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public float getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(float precoItem) {
        this.precoItem = precoItem;
    }


    }


