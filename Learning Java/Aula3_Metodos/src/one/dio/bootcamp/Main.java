package one.dio.bootcamp;

public class Main {

    public static void main(String[] args) {
        //calculadora
        System.out.println("Calculadora");
        Calculadora.soma(4, 7);
        Calculadora.subtracao(5, 2);
        Calculadora.multiplicacao(3, 9);
        Calculadora.divisao(6, 12);

        //area do quadrilatero
        System.out.println("Area do quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(5, 5);
        Quadrilatero.area(7, 8, 9);
        //usando retorno ao invez de console
        float areaLosango = Quadrilatero.area(5f, 5f);
        System.out.println("Area do losango: " + areaLosango);
    }
}
