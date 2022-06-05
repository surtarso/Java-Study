package dio;

public class Main {
    public static void main(String[] args) {

        //cria um novo objeto da classe Carro
        Carro carro1 = new Carro(); //construtor padrao (sem parametros)
        //seta valores um a um manualmente
        carro1.setCor("Verde");
        carro1.setModelo("Fusca");
        carro1.setCapacidadeTanque(120);
        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        //criando o objeta com a sobrecarga (valores direto no objeto, setters)
        Carro carro2 = new Carro("Vermelho", "Fusca", 140);
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.39));
    }
}
