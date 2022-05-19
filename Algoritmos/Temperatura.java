public class Temperatura {

    public static void main(String[] args) {

        double[] temp = new double[7];
        double soma = 0;
        int contd = 0;

        for (int i = 0; i < temp.length; i++) {
            temp[i] = Entrada.leiaDouble("Insira a temperatura do dia em °C: " + "(" + (i+1) + "°)");
            soma = temp[i] + soma;
        }

        for (int i = 0; i < temp.length; i++) {
            if (temp[i]>(soma/7)){contd++;}
        }

        System.out.println(contd+" dias da semana tiveram temperatura acima da média.");
    }
}