package model;

/*
1) Modele uma classe chamada Aluno para definir os objetos que representam os alunos da instituição. 
Essa classe deve declarar três atributos: 
    - O primeiro para o nome;
    - O segundo para a matrícula
    - O terceiro para a data de nascimento dos alunos;
Todos com visibilidade privada. Modificações e acessos a atributos são feitos via métodos setters e getters, respectivamente. 
Todos os atributos são obrigatórios no ato da criação de um aluno. 
Matricula não pode ser modificado posteriormente, mas nome e data de nascimento, sim.
*/

public class Aluno {
	private String nome;
	private String matricula;
	private String dataNasc;
    private Turma turma;
	
    // Construtor da classe
    public Aluno(String nome, String matricula, String dataNasc) {
        this.nome      = nome;
        this.matricula = matricula;
        this.dataNasc  = dataNasc;
        this.turma = null;
    }
    
    public String getRelatorio(){
        String relatorio = "\n"+
                           "Nome:............"+nome+     "\n"+
                           "Matricula:......."+matricula+"\n"+
                           "Data de Nasc:...."+dataNasc +"\n";      
        return relatorio;
    }
    
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}

    public String getMatricula(){return matricula;}
    
    public String getDataNasc(){ return dataNasc;}
    public void setDataNasc(String dataNasc){this.dataNasc = dataNasc;}
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
