public class Gerente extends Funcionario {
        private String departamento;
        private double desconto;


    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getDesconto() {
        return desconto;
    }
    public void calcularBonus() {
        this.desconto = salario * 0.9;
    }
}
