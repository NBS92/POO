package model.funcionario;

public abstract class funcionario {
	  private String nome;
	    private String cpf;
	    private double salario;

	    // Construtor
	    public funcionario(String nome, String cpf, double salario) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.salario = salario;
	    }

	    // Getters e Setters
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }

	    public double getSalario() {
	        return salario;
	    }

	    // Método para calcular a bonificação (a ser sobrescrito pelas subclasses)
	    public double calcularBonificacao() {
	        return 0; // Implementação padrão para funcionários genéricos
	    }
}
