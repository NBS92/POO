package control;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.funcionario.Funcionario; 
import model.funcionario.Coordenador;
import model.funcionario.Diretor;
import model.funcionario.Professor;
import model.funcionario.Tecnico;

public class controleFuncionario {
    Map<String, Funcionario> func = new HashMap<>();
    
    public boolean cadastrarFunc(String nome, String cpf, double salario, String doc, String tipo) {
        if (func.get(doc) == null) {
            Funcionario funcionario = null;
            switch (tipo) {
                case "Coordenador":
                    funcionario = new Coordenador(nome, cpf, salario);
                    break;
                case "Diretor":
                    funcionario = new Diretor(nome, cpf, salario);
                    break;
                case "Professor":
                    funcionario = new Professor(nome, cpf, salario);
                    break;
                case "Tecnico":
                    funcionario = new Tecnico(nome, cpf, salario);
                    break;
                default:
                    return false; 
            }
            func.put(doc, funcionario);
            return true;
        }
        return false;
    }

    public String getRelatorioTodosFunc() {
        StringBuilder relatorio = new StringBuilder();
        for (Funcionario f : func.values()) {
            relatorio.append(f.getRelatorio()).append("\n\n");
        }
        return relatorio.toString();
    }

    public ArrayList<String> getFuncionario(String entrada) {
        ArrayList<String> saida = new ArrayList<>();
        String str = entrada.split(" ")[0];
        for (String s : func.keySet()) {
            if (func.get(s).getNome().contains(str)) {
                saida.add(s + " - " + func.get(s).getNome());
            }
        }
        return saida;
    }

    public double emitirRelatorioGastos() {
        double totalGastos = 0;
        for (Funcionario f : func.values()) {
            totalGastos += f.getSalario();
        }
        return totalGastos;
    }
}
