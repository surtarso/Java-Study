package dio;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();
        //se n conseguir adicionar, da erro
        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chev"));
        queueCarros.add(new Carro("Fiat"));

        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        //retorna false se n consguir executar(adicionar)
        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);
        //se a fila estiver vazia retorna nulo. mostra o primeiro e nao remove
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);
        // pega o primeiro e remove
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);
        //diz se a fila esta vazia
        System.out.println(queueCarros.isEmpty());
        //tamanho da fila
        System.out.println(queueCarros.size());
    }
}
