package dio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chev"));
        listaCarros.add(new Carro("Volks"));

        //compara se objeto criado existe
        System.out.println(listaCarros.contains(new Carro("Ford")));
        //print hashcode
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford1").hashCode());

        //compara
        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Chev");
        System.out.println(carro1.equals(carro2));
    }
}
