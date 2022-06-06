package dio;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiExemplos {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("imprime todos os elementos: ");
        numerosAleatorios.forEach(System.out::print);

        System.out.println("5 primeiros em um set: ");
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(collectSet);

        System.out.println("transforma list de string para inteiros: ");
        List<Integer> collectList = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(collectList);

        System.out.println("list com pares >2: ");

        List<String> numerosAleatorios2 =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        List<Integer> listParesMaioresQue2 = numerosAleatorios2.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);

        System.out.println("media dos numeros: ");
        numerosAleatorios2.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("remove valores impares: ");
        collectList.removeIf(integer -> (integer %2 != 0));
        System.out.println(collectList);
    }
}
