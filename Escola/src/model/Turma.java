package model;

public class Turma {
    private Curso curso;
    private int serieSemestre;

    // Construtor que recebe todos os atributos obrigatórios
    public Turma(Curso curso, int serieSemestre) {
        if (curso == null) {
            throw new IllegalArgumentException("Curso não pode ser nulo");
        }
        this.curso = curso;
        this.serieSemestre = serieSemestre;
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
}

