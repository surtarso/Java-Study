package dio;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // cria uma nova pilha de carros
        Stack<Carro> stackCarros = new Stack<>();
        //adiciona novos carros
        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chev"));
        stackCarros.push(new Carro("Fiat"));
        //adicionados na ordem, o ultimo esta no topo da pilha
        System.out.println(stackCarros);

        //remove o ultimo a ser adicionado (topo da pilha)
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        //exibe sem retirar
        System.out.println(stackCarros.peek());
        System.out.println(stackCarros);

        //verifica se esta vazia
        System.out.println(stackCarros.empty()); // true/false
    }
}
