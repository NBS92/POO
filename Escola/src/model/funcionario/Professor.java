/*
3) Um Professor tem um atributo para representar a sua carga horária semanal, e há uma bonificação que 
se baseia nessa carga horária (a regra ou porcentagem fica a seu critério).
*/
package model.funcionario;

public class Professor extends Funcionario {
    private int cargaHoraria;

    public Professor(String nome, String cpf, double salario, int cargaHoraria) {
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