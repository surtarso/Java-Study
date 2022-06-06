package dio.repeticao;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qntNumeros;
        int numero;
        int qntPares = 0, qntImpar = 0;

        System.out.println("Quantos numeros: ");
        qntNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("numero: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) qntPares++;
            else qntImpar++;

            count++;
        } while (count < qntNumeros);

        System.out.println("qnt Pares: " + qntPares);
        System.out.println("qnt Impar: " + qntImpar);
    }
}
