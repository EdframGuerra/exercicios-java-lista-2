package exercicio030;

public class Salario {
    private double hora;
    private double valorHora;

    public Salario(double hora, double valorHora) {
        this.hora = hora;
        this.valorHora = valorHora;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double salarioBruto(double hora, double valorHora) {
        return hora * valorHora;
    }

    public double irpf(double hora, double valorHora) {
        double percentual;
        double ir = 0.0;
        if (salarioBruto(hora, valorHora) <= 900.00) {
            System.out.println("Imposto Isento");
        }

        else if (salarioBruto(hora, valorHora) > 900.00 || salarioBruto(hora, valorHora) <= 1500.00) {
            percentual = 5.0 / 100;
            ir = salarioBruto(hora, valorHora) * percentual;
        } else if (salarioBruto(hora, valorHora) > 1500.00 || salarioBruto(hora, valorHora) <= 2500.00) {
            percentual = 10.0 / 100;
            ir = salarioBruto(hora, valorHora) * percentual;
        } else if (salarioBruto(hora, valorHora) > 2500.00) {
            percentual = 20.0 / 100;
            ir = salarioBruto(hora, valorHora) * percentual;
        }

        return ir;
    }

    public double inss(double hora, double valorHora) {
        double percentual = 10.0 / 100.0;
        return (hora * valorHora) * percentual;
    }

    public double fgts(double hora, double valorHora) {
        double percentual = 11.0 / 100;
        return (hora * valorHora) * percentual;
    }

    public double totalDescontos(double hora, double valorHora) {
        double descontos = inss(hora, valorHora) + irpf(hora, valorHora);
        return descontos;
    }

    public double salarioLiquido(double hora, double valorHora) {
        double salario = salarioBruto(hora, valorHora) - totalDescontos(hora, valorHora);
        return salario;
    }
}
