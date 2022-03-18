public class Calculadora {
    public String operacao;
    public double valor1;
    public double valor2;

    public double FazOperacao(Operacao oper){
        this.operacao = oper.nome;
        this.valor1 = oper.valor1;
        this.valor2 = oper.valor2;
        if(this.operacao == "Adicao"){
            return valor1 + valor2;
        }
        else if (this.operacao == "Subtracao"){
            return valor1-valor2;
        }
        else if (this.operacao == "Multiplicacao"){
            return valor1*valor2;
        }
        else if (this.operacao == "Divisao"){
            if(valor2 != 0) {
                return valor1 - valor2;
            }
            else {
                System.out.println("Valor2 invalido! "+ valor2);
            }
        }
        System.out.println("Not Found :(");
        return 404;
    }
}
