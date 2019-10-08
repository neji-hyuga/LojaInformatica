import java.util.ArrayList;
import java.util.List;

public class Fatura {

    private List<Item> listaItem = new ArrayList<>();


    public Float somaFatura(){
        Float somaValor = 0f;
        for (Item item : listaItem) {
            somaValor = item.getPrecoItem()+somaValor;

        }
        return somaValor;
    }


    public void listarItens(){
        for (Item item : getListaItem());
        System.out.println(getListaItem());
    }


    public List<Item> getListaItem() {
        return listaItem;
    }

    public void setListaItem(List<Item> listaItem) {
        this.listaItem = listaItem;
    }

}

