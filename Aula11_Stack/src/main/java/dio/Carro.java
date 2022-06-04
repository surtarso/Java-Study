package dio;

import java.util.Objects;

public class Carro {

    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // se esse objeto for igual o passado
        if (o == null || getClass() != o.getClass()) return false; //se as classes forem dif.
        Carro carro = (Carro) o; // cache, cria objeto carro
        return Objects.equals(marca, carro.marca); //compara atributo marca
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca); //retorna um hash de int
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
