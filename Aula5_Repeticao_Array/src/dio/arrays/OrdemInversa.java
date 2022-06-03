package dio.arrays;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        System.out.print("normal: ");
        int[] vetor = {-81, 5, 67, 234, -8, 777};
        int count = 0;

        while(count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print(" inverso: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
