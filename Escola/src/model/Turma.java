package model;
/*
7)- Modele uma classe chamada Turma que contenha dois atributos: 
    - o primeiro para o curso, 
    - o segundo para definir a série ou semestre. 
Todos os seus atributos são privados e ações de modificação e acesso a atributos são feitos via métodos setters e getters, 
respectivamente. 
Todos os atributos são obrigatórios no ato da criação. 
O atributo que representa o curso ao qual a turma pertence não pode ser modificado após a criação.
*/
import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Curso curso;
    private int serieSemestre;
    private List<Aluno> alunos;

    // Construtor que recebe todos os atributos obrigatórios
    public Turma(Curso curso, int serieSemestre) {
        if (curso == null) {
            throw new IllegalArgumentException("Curso não pode ser nulo");
        }
        this.curso = curso;
        this.serieSemestre = serieSemestre;
        this.alunos = new ArrayList<>();
    }

    // Getters e Setters
    public Curso getCurso() {
        return curso;
    }

    // O setter para o curso não é fornecido, pois o curso não pode ser modificado após a criação

    public int getSerieSemestre() {
        return serieSemestre;
    }

    public void setSerieSemestre(int serieSemestre) {
        this.serieSemestre = serieSemestre;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}

