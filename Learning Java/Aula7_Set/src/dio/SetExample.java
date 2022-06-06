package dio;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {

        System.out.println("criar conjunto e adicionar notas");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("nota 5.0 esta no set?: " + notas.contains(5d));

        System.out.println("menor: " + Collections.min(notas));
        System.out.println("maior: " + Collections.max(notas));

        System.out.println("soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("soma = " + soma);
        System.out.println("media = " + (soma / notas.size()));

        System.out.println("remover a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("remove <7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("na ordem informada: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("ordem crescente: ");
        Set<Double> nota3 = new TreeSet<>(notas2);
        System.out.println(nota3);

        System.out.println("apagar o set 1");
        notas.clear();
        System.out.println("esta vazio o 1?: " + notas.isEmpty());
        System.out.println("esta vazio o 2?: " + notas2.isEmpty());
    }
}
