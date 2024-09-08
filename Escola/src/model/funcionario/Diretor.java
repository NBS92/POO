/*
3) Um coordenador é também um professor, e sua bonificação é baseada, além da carga horária de sala de aula, em um acréscimo 
fixo baseado no cargo. 
*/
package model.funcionario;

public class Diretor extends Funcionario {
    private static final double BONIFICACAO_CARGO = 1000.0; // Valor fixo de bonificação para Diretor

    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double calcularBonificacao() {
        // Bonificação baseada apenas no cargo
        return BONIFICACAO_CARGO;
    }
}
