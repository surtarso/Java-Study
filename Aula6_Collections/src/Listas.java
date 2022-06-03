import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Listas {
    public static void main(String[] args) {
        System.out.println("list de 7 notas: ");
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("posicao da nota 5.0: " + notas.indexOf(5d));
        System.out.println("adicione 8.0 na posicao 5: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("subs 5.0 por 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("nota 5.0 esta na lista?: " + notas.contains(5d));

        System.out.println("na ordem que foram informadas: ");
        for (Double nota : notas) System.out.print(nota + " ");

        System.out.println("\nterceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("menor nota: " + Collections.min(notas));
        System.out.println("maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("soma: " + soma);

        System.out.println("media: " + (soma/notas.size()));

        System.out.println("remover item nota 0.0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("remover posicao 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("remove <7 e exibe: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();

        }
        System.out.println(notas);

        System.out.println("apagar lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("esta vazia?: " + notas.isEmpty());
    }
}