package dio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dio.banco.Pessoa;
import dio.banco.Conta;

public class BancoMain {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<>();
        logoBanco();
        menuBanco();
    }

    public static void logoBanco(){
        System.out.println("--------------------------------------------------------");
        System.out.println("---------- Hypertext Transfer Protocol Bank ------------");
        System.out.println("-------------- Bem vindo à nossa Agência ---------------");
        System.out.println("--------------------------------------------------------");
        System.out.println(" h    httttttt ppppp         bbbbb                #     ");
        System.out.println(" #    #   #    #   '#        #    #  aaa,  n nn   #  k  ");
        System.out.println(" #hhhh#   #    #ppp#'        #bbb `     à  #  #   # k   ");
        System.out.println(" #    #   #    #       ''''  #    #  aaa'  #   #  #`#   ");
        System.out.println(" #    #   #    #             #bbbb`  aa #  #   #  #  `k ");
        System.out.println("--------------------------------------------------------");
    }
    public static void menuBanco() {
        System.out.println("--------------------------------------------------------");
        System.out.println("------  Selecione a operação que deseja realizar:  -----");
        System.out.println("--------------------------------------------------------");
        System.out.println("|   Opção 1 - Criar uma nova conta   |");
        System.out.println("|   Opção 2 - Depositar em conta     |");
        System.out.println("|   Opção 3 - Sacar de conta         |");
        System.out.println("|   Opção 4 - Transferir para conta  |");
        System.out.println("|   Opção 5 - Listar as contas       |");
        System.out.println("|   Opção 6 - Sair do Banco          |");

        int operacao = input.nextInt(); //quebra se usar "\"

        switch (operacao) {
            case 1:
                criarConta();
                break;

            case 2:
                depositar();
                break;

            case 3:
                sacar();
                break;

            case 4:
                transferir();
                break;

            case 5:
                listarContas();
                break;

            case 6:
                System.out.println("Obrigado por usar nossos serviços");
                System.exit(0); // para o sistema

            default:
                System.out.println("Opção não existente, digite um numero entre 1 e 6");
                menuBanco();
                break;
        }
    }

    public static void criarConta() {
        System.out.println("Criação de conta em andamento:");
        //-----NOME:
        System.out.println("Digite seu Nome: ");
        String nome = input.next();
        char[] nomeChars = nome.toCharArray();
        for(char c: nomeChars) {
            //checa se existem numeros no nome
            if(Character.isDigit(c)){
                System.out.println("ERRO: Nome Inválido. Tente novamente.");
                criarConta();
                break;
            }
        }
        //------CPF:
        System.out.println("\nDigite seu CPF sem pontos(.) ou traços(-): ");
        String cpf = input.next();
        char[] cpfChars = cpf.toCharArray();
        for(char c: cpfChars) {
            //checa se CPF tem 11 digitos e composto apenas por numeros
            if(!Character.isDigit(c) || cpf.length() != 11){
                System.out.println("ERRO: CPF Inválido. Tente novamente.");
                criarConta();
                break;
            }
        }
        //------EMAIL:
        System.out.println("Digite seu Email: ");
        String email = input.next();
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
        Pattern emailFormatado = Pattern.compile(emailRegex);
        Matcher checaFormatacao = emailFormatado.matcher(email);
        //checa se o email foi formatado corretamente de acordo com regex
        if(!checaFormatacao.matches()) {
            System.out.println("ERRO: E-Mail inválido. Tente novamente.");
            criarConta();
        }

        // se tudo deu certo:
        Pessoa cliente = new Pessoa(nome, cpf, email); //cria novo cliente
        Conta conta = new Conta(cliente); //cria nova conta com o cliente
        contasBancarias.add(conta); //adiciona a conta do cliente
        System.out.println("--- Sua conta foi criada com sucesso! ---");

        menuBanco();

    }

    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;
        if(contasBancarias.size() > 0) {
            for(Conta contas : contasBancarias) {
                if(contas.getNumeroConta() == numeroConta) {
                    conta = contas;
                }
            }
        }
        return conta; //pode retornar NULL
    }

    public static void depositar() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();
        Conta conta = encontrarConta(numeroConta);

        if(conta != null) { //se a conta existir
            System.out.println("Qual valor deseja depositar? ");
            Double valorDeposito = input.nextDouble();

            conta.depositar(valorDeposito);
        }else { //se chegar a conta NULL
            System.out.println("--- Conta não encontrada ---");
        }

        menuBanco();

    }

    public static void sacar() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if(conta != null) { //se a conta existir
            System.out.println("Qual valor deseja sacar? ");
            Double valorSaque = input.nextDouble();

            conta.sacar(valorSaque);
            System.out.println("--- Saque realizado com sucesso! ---");
        }else { //se chegar a conta NULL
            System.out.println("--- Conta não encontrada ---");
        }

        menuBanco();

    }

    public static void transferir() {
        System.out.println("Número da conta que vai enviar a transferência: ");
        int numeroContaRemetente = input.nextInt();

        Conta contaRemetente = encontrarConta(numeroContaRemetente);

        if(contaRemetente != null) {
            System.out.println("Número da conta do destinatário: ");
            int numeroContaDestinatario = input.nextInt();

            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);

            if(contaDestinatario != null) {
                System.out.println("Valor da transferência: ");
                Double valor = input.nextDouble();

                contaRemetente.transferencia(contaDestinatario, valor);

            }else {
                System.out.println("--- A conta para depósito não foi encontrada ---");
            }

        }else {
            System.out.println("--- Conta para transferência não encontrada ---");
        }
        menuBanco();
    }

    public static void listarContas() {
        if(contasBancarias.size() > 0) {
            for(Conta conta: contasBancarias) {
                System.out.println(conta);
            }
        }else {
            System.out.println("--- Não há contas cadastradas ---");
        }

        menuBanco();
    }
}
