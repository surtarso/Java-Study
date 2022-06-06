package dio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main { //recebe um vetor de argumentos
    public static void main(String[] args) {
        //map<chave, valor>
        Map<String, String> aluno = new HashMap<>();
        //colocar alunos
        aluno.put("nome", "joao");
        aluno.put("media", "8.5");
        aluno.put("idade", "17");
        aluno.put("turma", "3a");
        System.out.println(aluno);
        //retorna apenas as chaves
        System.out.println(aluno.keySet());
        //retorna apenas valores
        System.out.println(aluno.values());
        //lista de alunos
        List<Map<String, String>> listaAluno = new ArrayList<>();
        //adiciona aluno na lista
        listaAluno.add(aluno);
        //cria novo aluno
        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("nome", "maria");
        aluno2.put("media", "8");
        aluno2.put("idade", "16");
        aluno2.put("turma", "3a");
        //adiciona novo aluno na mesma lista
        listaAluno.add(aluno2);
        System.out.println(listaAluno);
        //testar se existe chave
        System.out.println(aluno.containsKey("nome"));
    }
}
