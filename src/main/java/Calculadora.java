public class Calculadora {
    public String operacao;
    public double valor1;
    public double valor2;

    public double FazOperacao(Operacao oper){
        this.operacao = oper.nome;
        this.valor1 = oper.valor1;
        this.valor2 = oper.valor2;
        if(this.operacao.contains("Adicao")){
            return valor1 + valor2;
        }
        else if (this.operacao.contains("Subtracao")){
            return valor1-valor2;
        }
        else if (this.operacao.contains("Multiplicacao")){
            return valor1*valor2;
        }
        else if (this.operacao.contains("Divisao")){
            if(valor2 != 0) {
                return valor1 / valor2;
            }
            else {
                System.out.println("Valor2 invalido! ");
                return 406;
            }
        }
        System.out.println("Not Found :(");
        return 404;
    }
}
