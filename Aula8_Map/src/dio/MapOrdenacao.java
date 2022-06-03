package dio;

import java.util.*;

public class MapOrdenacao {
    public static void main(String[] args) {

        System.out.println("ordem aleatoria: ");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("mario", new Livro("te comeu", 256));
            put("cunha", new Livro("na cadeia", 408));
            put("thedude", new Livro("yeahhhh", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " " + livro.getValue().getNome());
        }

        System.out.println("ordem alfabetica autores: (por key)");
        Map<String, Livro> meusLivros1 = new TreeMap<>(meusLivros);
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " " + livro.getValue().getNome());
        }

        System.out.println("ordem alfabetica livros: (por value)");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        System.out.println(meusLivros3);
        for (Map.Entry<String, Livro> livro : meusLivros3) {
            System.out.println(livro.getKey() + " " + livro.getValue().getNome());
        }

    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
