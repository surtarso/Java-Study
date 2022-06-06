package dio;

//inicio da classe:
public class Carro {

    //ATRIBUTOS: atributos da classe
    String cor;
    String modelo;
    int capacidadeTanque;

    //CONSTRUTOR: se nao for chamado de forma explicita, é criado por default
    Carro(){} //opcional
    //sobrecarga do construtor com 3 parametros
    Carro(String cor, String modelo, int capacidadeTanque){
        //este.atributo = parametro
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    //SETTERS:
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    //GETTERS:
    public String getCor() {
        return cor;
    }
    public String getModelo() {
        return modelo;
    }
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    //METODOS:
    //valor total do tanque (encher o tanque)
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }


    //DESTRUTOR: liberar recursos (coletor de lixo chama o destrutor)
    //protected void finalize(){}
}
