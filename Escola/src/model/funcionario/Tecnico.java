/*
3) Um técnico tem os atributos e métodos básicos de funcionário, apenas.
*/
package model.funcionario;

public class Tecnico extends Funcionario {

    public Tecnico(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double calcularBonificacao() {
        return 0; // Bonificação específica para técnico, se houver
    }
}
