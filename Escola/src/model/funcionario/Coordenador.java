/*
3) Um diretor tem sua bonificação baseada apenas no cargo.
*/
package model.funcionario;

public class Coordenador extends Professor {
    private static final double BONIFICACAO_FIXA = 500.0; 

    public Coordenador(String nome, String cpf, double salario, int cargaHoraria) {
        super(nome, cpf, salario, cargaHoraria);
    }

    @Override
    public double calcularBonificacao() {
        return super.calcularBonificacao() + BONIFICACAO_FIXA;
    }
}