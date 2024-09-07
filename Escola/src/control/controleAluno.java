package control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import model.Usuario.Aluno;

public class controleAluno {
    Map<String, Aluno> aluno = new HashMap<>();
    
    public boolean cadastrarAluno(String nome, String matricula, String dataNascimento, String doc) {
        if (aluno.get(doc) == null) {
        	aluno.put(doc, new Aluno(nome, matricula, dataNascimento));
            return true;
        }
        return false;
    }

    public String getRelatorioTodosClientes() {
        String relatorio = "\n";

        for (Aluno c : aluno.values()) {
            relatorio += c.getRelatorio() + "\n\n";
        }

        return relatorio;
    }

    public ArrayList getAluno(String entrada){
        ArrayList<String> saida = new ArrayList<>();
        String str = entrada.split(" ")[0];
        for(String s : aluno.keySet()){
            if(aluno.get(s).getNome().contains(str)) saida.add(s + " - " + aluno.get(s).getNome());
        }
        return saida;
    }
}


