package dio.jdbc.entity;

import java.util.Objects;

public class Cliente {
    private Integer id;
    private String nome;
    //getter
    public Integer getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    //setter
    public void setId(Integer id){
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id.equals(cliente.id) && nome.equals(cliente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
