package model.funcionario;

public class professor extends funcionario {
    private int cargaHoraria;

    public professor(String nome, String cpf, double salario, int cargaHoraria) {
        super(nome, cpf, salario);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularBonificacao() {
        // Regra de bonificação baseada na carga horária (exemplo: 1% do salário por hora)
        return getSalario() * (cargaHoraria / 100.0);
    }
}