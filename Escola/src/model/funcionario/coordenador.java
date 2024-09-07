package model.funcionario;

public class coordenador extends professor {
    private static final double BONIFICACAO_FIXA = 500.0; 

    public coordenador(String nome, String cpf, double salario, int cargaHoraria) {
        super(nome, cpf, salario, cargaHoraria);
    }

    @Override
    public double calcularBonificacao() {
        return super.calcularBonificacao() + BONIFICACAO_FIXA;
    }
}