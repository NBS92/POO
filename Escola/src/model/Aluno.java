package model;

public abstract class Aluno {
	private String nome;
	private String matricula;
	private String dataNasc;
	
	// Construtor da classe
    public Aluno(String nome, String matricula, String dataNasc) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNasc = dataNasc;
    }
    
    public abstract String getRelatorio();
    
    public String getNome() {
        return nome;
    }
    public String getMatricula() {
    	return matricula;
    }
    public String getDataNasc() {
    	return dataNasc;
    }
}
