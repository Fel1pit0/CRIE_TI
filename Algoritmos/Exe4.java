public class exe4 {

    public static void main(String[] args) {
        int idade = 0,
                c1 = 0,
                c2 = 0,
                c3 = 0,
                i = 1;

        double altura = 0,
                soma = 0,
                peso = 0;

        for (i = 1; i <= 2; i++) {
            idade = Entrada.leiaInt("Digite a idade:");
            altura = Entrada.leiaDouble("Digite a altura:");
            peso = Entrada.leiaDouble("Digite o peso:");

            if (idade > 50) {
                c1++;
            }

            if ((idade >= 10) && (idade <= 20)) {
                c2++;
                soma += altura;
            }

            if (peso < 40) {
                c3++;
            }
        }

        acimaCinq(c1);
        media(c2, soma);
        porcentagem(c3, i);

        System.exit(0);
    }

    public static void acimaCinq(int cont) {
        System.out.println("A quantidade de pessoas acima de 50 anos: " + cont + "\n");
    }

    public static void media(int cont2, double som) {
        double media = som / cont2;
        System.out.printf("A media das alturas de pessoas entre 10 e 20 anos: %.1f ", media);
        System.out.println("m \n");
    }

    public static void porcentagem(int cont3, int in) {
        double porcent = 0;
        porcent = ((double) cont3 / (in - 1)) * 100;
        System.out.printf("Porcentagem de pessoas com peso inferior a 40kg: %.1f%% \n", porcent);
    }
}