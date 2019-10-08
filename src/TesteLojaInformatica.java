import java.util.ArrayList;
import java.util.List;

public class TesteLojaInformatica {

    public static void main(String[] args) {

        Item item1 = new Item("cartucho impressora", 232222, 30, 50F);
        Item item2 = new Item("roteador", 15481, 2, 300F);
        Item item3 = new Item("teclado", 8784811, -1, 100F);
        Item item4 = new Item("mouse", 5416818, 100, -8f);

        Fatura fatura1 = new Fatura();
        fatura1.getListaItem().add(item1);


        System.out.println(fatura1.somaFatura());
        System.out.println();



        






    }
}
