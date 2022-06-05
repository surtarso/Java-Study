package dio.exercicio4;

public class Calculadora implements OperacaoMatematica {
    // tem q implementar todas as funcoes da interface ou da erro
    @Override
    public void soma(double operando1, double operando2) {
        System.out.println(operando1 + operando2);
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        System.out.println(operando1 - operando2);
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        System.out.println(operando1 * operando2);
    }

    @Override
    public void divisao(double operando1, double operando2) {
        System.out.println(operando1 / operando2);
    }
}
