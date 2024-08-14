package exercicio043;

public class Combustiveis {

    private char tipoCombustivel;
    private Double qtdCombustivel;


    public Combustiveis(char tipoCombustivel, Double qtdCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.qtdCombustivel = qtdCombustivel;

    }

    public char getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(char tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Double getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(Double qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }

    public Double descontoValorLitro(char tipoCombustivel, Double qtdCombustivel) {
        Double desconto = 0.00;
        Double alcool = 1.90;
        Double gasolina =2.50;

        if (tipoCombustivel == 'A') {
            if (qtdCombustivel <= 20) {
                desconto = 3.0 / 100.0;
                Double valorDescontoLitro = alcool * desconto;
                return valorDescontoLitro;

            } else if (qtdCombustivel > 20) {
                desconto = 5.0 / 100.0;
                Double valorDescontoLitro = alcool * desconto;
                return valorDescontoLitro;
            }
        }
        if (tipoCombustivel == 'G') {
            if (qtdCombustivel <= 20) {
                desconto = 4.0 / 100.0;
                Double valorDescontoLitro = gasolina * desconto;
                return valorDescontoLitro;
            } else if (qtdCombustivel > 20) {
                desconto = 6.0 / 100.0;
                Double valorDescontoLitro = gasolina * desconto;
                return valorDescontoLitro;
            }
        }
        return null;
    }

    public Double valorPromocionalCombustivel(char tipoCombustivel, Double qtdCombustivel){
        Double alcool = 1.90;
        Double gasolina =2.50;
        if(tipoCombustivel=='A'){
            if(qtdCombustivel<=20){
                Double precoPromocao = alcool - descontoValorLitro(tipoCombustivel,qtdCombustivel);
                return precoPromocao;
            } else if (qtdCombustivel>20) {
                Double precoPromocao = alcool - descontoValorLitro(tipoCombustivel,qtdCombustivel);
                return precoPromocao;
            }
        } else if (tipoCombustivel=='G') {
            if(qtdCombustivel<=20){
                Double precoPromocao = gasolina - descontoValorLitro(tipoCombustivel,qtdCombustivel);
                return precoPromocao;
            } else if (qtdCombustivel>20) {
                Double precoPromocao = gasolina - descontoValorLitro(tipoCombustivel,qtdCombustivel);
                return precoPromocao;
            }
        }
        return  null;
    }


    public Double descontoValorTotal(char tipoCombustivel, Double qtdCombustivel){

        if(tipoCombustivel=='A'){
            double valorDesconto =  qtdCombustivel*descontoValorLitro(tipoCombustivel,qtdCombustivel);
            return valorDesconto;
        } else if (tipoCombustivel=='G') {
            double valorDesconto =  qtdCombustivel*descontoValorLitro(tipoCombustivel,qtdCombustivel);
            return valorDesconto;
        }
        return null;
    }

    public Double valorPagar(char tipoCombustivel, Double qtdCombustivel){
        if(tipoCombustivel=='A'){

            Double valorTotal = qtdCombustivel*valorPromocionalCombustivel(tipoCombustivel,qtdCombustivel);
            return valorTotal;
        } else if (tipoCombustivel=='G') {
            Double valorTotal = qtdCombustivel*valorPromocionalCombustivel(tipoCombustivel,qtdCombustivel);
            return valorTotal;
        }
        return null;
    }
}