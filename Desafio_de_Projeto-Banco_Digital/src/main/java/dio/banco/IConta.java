package dio.banco;

public interface IConta {
    void depositar(Double valor);
    void sacar(Double valor);
    void transferencia(Conta contaParaDeposito, Double valor);
}
