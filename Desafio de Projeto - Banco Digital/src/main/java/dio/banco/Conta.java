package dio.banco;

public class Conta implements IConta {

    private static int numeroDaConta = 1;
    private final int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    public Conta(Pessoa pessoa) {
        this.numeroConta = Conta.numeroDaConta;
        this.pessoa = pessoa;
        this.updateSaldo();
        Conta.numeroDaConta += 1;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    private void updateSaldo() {
        this.saldo = this.getSaldo();
    }

    public String toString() {
        return "\nAgencia: 0001" +
                "\nConta: " + this.getNumeroConta() +
                "\nCliente: " + this.pessoa.getName() +
                "\nCPF: " + this.pessoa.getCpf() +
                "\nEmail: " + this.pessoa.getEmail() +
                "\nSaldo: " + Utils.doubleToString(this.getSaldo()) +
                "\nData de Criação: " + Utils.dateToString(this.pessoa.getAccountCreationDate());
    }

    public void depositar(Double valor) {
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Seu depósito foi realizado com sucesso!");
        }else {
            System.out.println("Não foi possível realizar o depósito!");
        }
    }

    public void sacar(Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) { //se houver saldo disponivel
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
        }else {
            System.out.println("Não foi possível realizar o saque!");
        }
    }

    public void transferencia(Conta contaParaDeposito, Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Transferência realizada com sucesso!");
        }else {
            System.out.println("Não foi possível realizar a tranferência");
        }
    }
}
