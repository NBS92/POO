package control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.Aluno;

public class controleAluno {
    Map<String, Aluno> alunos = new HashMap<>();
    
    public boolean cadastrarAluno(String nome, String matricula, String dataNascimento, String doc) {
        if (alunos.get(doc) == null){
            alunos.put(doc, new Aluno(nome, matricula, dataNascimento));
            return true;
        }
        return false;
    }

    public String getRelatorioTodosAlunos() {
        String relatorio = "\n";
        for (Aluno c : alunos.values()) {
            relatorio += c.getRelatorio() + "\n\n";
        }
        return relatorio;
    }

    public ArrayList getAluno(String entrada){
        ArrayList<String> saida = new ArrayList<>();
        String str = entrada.split(" ")[0];
        for(String s : alunos.keySet()){
            if(alunos.get(s).getNome().contains(str)) saida.add(s + " - " + alunos.get(s).getNome());
        }
        return saida;
    }
}


