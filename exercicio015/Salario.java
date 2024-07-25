package exercicio015;

public class Salario {

    private double qtdHora;
    private double valorHora;

    public Salario(double qtdHora, double valorHora) {
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    public double getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(double qtdHora) {
        this.qtdHora = qtdHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double salarioBruto(double qtdHora, double valorHora) {
        return qtdHora * valorHora;
    }

    public double irpf(double valorHora, double qtdHora) {
        double resultado = (qtdHora * valorHora);
        return resultado * (11.0 / 100);
    }

    public double inss(double valorHora, double qtdHora) {
        double resultado = (qtdHora * valorHora);
        return resultado * (8.0 / 100);
    }

    public double sindicato(double valorHora, double qtdHora) {
        double resultado = (qtdHora * valorHora);
        return resultado * (5.0 / 100);
    }

    public double salarioLiquido(double valorHora, double qtdHora) {
        double resultado = (qtdHora * valorHora);

        return resultado
                - (irpf(valorHora, qtdHora) + inss(valorHora, qtdHora) + sindicato(valorHora, qtdHora));
    }
}
