package dio.exercicio1;

public class RodarAplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //upcast implicito (correto)
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        //downcast (nao usar)
        //Gerente gerente1 = new Funcionario(); // gera um erro
        //Vendedor vendedor1 = (Vendedor) new Funcionario(); //class exception error
    }
}
