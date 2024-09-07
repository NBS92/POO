package model;

public class Curso {
    private String nome;
    private String sigla;
    private String modalidade; // Modalidade pode ser "Graduação" ou "Ensino Técnico"

    // Construtor que recebe todos os atributos obrigatórios
    public Curso(String nome, String sigla, String modalidade) {
        this.nome = nome;
        this.sigla = sigla;
        setModalidade(modalidade); 
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        if (modalidade.equalsIgnoreCase("Graduação") || modalidade.equalsIgnoreCase("Ensino Técnico")) {
            this.modalidade = modalidade;
        } else {
            throw new IllegalArgumentException("Modalidade deve ser 'Graduação' ou 'Ensino Técnico'");
        }
    }
}
