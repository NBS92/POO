package model.funcionario;

public class diretor extends funcionario {
    private static final double BONIFICACAO_CARGO = 1000.0; // Valor fixo de bonificação para diretor

    public diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double calcularBonificacao() {
        // Bonificação baseada apenas no cargo
        return BONIFICACAO_CARGO;
    }
}
