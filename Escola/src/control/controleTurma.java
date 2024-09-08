package control;

import model.Turma;
import model.Aluno;

public class ControleTurma {

    public void adicionarAlunoATurma(Aluno aluno, Turma turma) {
        // Se o aluno já estiver em uma turma, remove o aluno da turma antiga
        Turma turmaAntiga = aluno.getTurma(); // Usa o setter para adicionar a turma

        if (turmaAntiga != null) {
            turmaAntiga.getAlunos().remove(aluno);
        }

        // Adiciona o aluno à nova turma
        turma.getAlunos().add(aluno);
        aluno.setTurma(turma); // Atualiza a turma do aluno
    }

    public void mudarTurma(Aluno aluno, Turma novaTurma) {
        adicionarAlunoATurma(aluno, novaTurma); // Reutiliza o método de adicionar
    }
}
