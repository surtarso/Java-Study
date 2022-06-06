package dio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Fiat"));
        listaCarros.add(new Carro("Chev"));
        listaCarros.add(new Carro("Fusca"));
        //contem um ford?
        System.out.println(listaCarros.contains(new Carro("Ford")));
        //mostra nome por indice
        System.out.println(listaCarros.get(2));
        //pesquisar indice por nome
        System.out.println(listaCarros.indexOf(new Carro("Fiat")));
        //remove por index
        System.out.println(listaCarros.remove(2));
        System.out.println(listaCarros);
    }
}
