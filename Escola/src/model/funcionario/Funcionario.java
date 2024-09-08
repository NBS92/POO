package model.funcionario;
/*
3) No ambiente aqui descrito, além dos alunos, temos os funcionários, que também precisam ser representados na aplicação. 
Modele a classe Funcionario, que deve conter três atributos: 
    - O primeiro para o nome;
    - O segundo para o CPF;
    - O terceiro para o salário; 
Todos com visibilidade privada. 
Modificações, se necessárias, devem ser feitas via métodos setters, e acesso, por métodos getters.
Ademais, no ato da instanciação de um novo funcionário, é necessário informar seu nome e seu salário. 
Com exceção do CPF, todos os atributos são editáveis posteriormente. 
Os funcionários são especializados como professor, coordenador, diretor e técnico.  

11) Funcionario não pode ser concreta. Utilize classe abstrata ou interface para isso.
*/

public abstract class Funcionario {
	  private String nome;
	    private String cpf;
	    private double salario;

	    // Construtor
	    public Funcionario(String nome, String cpf, double salario) {
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
