import com.google.gson.Gson;

public class Exercicio {
    public static void main(String[] args) {

        String jsonOper1 = "{\"operacao\":\"Adicao\",\"valor1\":0.5\",\"valor2\":24.5\"}";
        String jsonOper2 = "{\"operacao\":\"Subtracao\",\"valor1\":0.5\",\"valor2\":25.5\"}";
        String jsonOper3 = "{\"operacao\":\"Multiplicacao\",\"valor1\":0.5\",\"valor2\":50.0\"}";
        String jsonOper4 = "{\"operacao\":\"Divisao\",\"valor1\":0.5\",\"valor2\":0.02\"}";
        String jsonOper5 = "{\"operacao\":\"Divisao\",\"valor1\":0.5\",\"valor2\":0.0\"}";
        String jsonOper6 = "{\"operacao\":\"Chuta\",\"valor1\":0.5\",\"valor2\":0.0\"}";


        Gson gson = new Gson();
        Operacao oper1 = gson.fromJson(jsonOper1, Operacao.class);
        Operacao oper2 = gson.fromJson(jsonOper2, Operacao.class);
        Operacao oper3 = gson.fromJson(jsonOper3, Operacao.class);
        Operacao oper4 = gson.fromJson(jsonOper4, Operacao.class);
        Operacao oper5 = gson.fromJson(jsonOper5, Operacao.class);
        Operacao oper6 = gson.fromJson(jsonOper6, Operacao.class);

        Calculadora calcula = new Calculadora();
        System.out.println("O valor da operacao e: "+calcula.FazOperacao(oper1));
        System.out.println("O valor da operacao e: "+calcula.FazOperacao(oper2));
        System.out.println("O valor da operacao e: "+calcula.FazOperacao(oper3));
        System.out.println("O valor da operacao e: "+calcula.FazOperacao(oper4));
        System.out.println("O valor da operacao e: "+calcula.FazOperacao(oper5));
        System.out.println("O valor da operacao e: "+calcula.FazOperacao(oper6));

    }


}
