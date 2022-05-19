public class faixaEtáriaIdade {

    public static void main(String[] args) {
        int f1 = 0,
                f2 = 0,
                f3 = 0,
                f4 = 0,
                f5 = 0;
        for (int i = 1; i <= 8; i++) {
            int idade = Entrada.leiaInt("Digite sua idade");
            if (idade <= 15) {
                f1 = f1 + 1;
            } else if (idade <= 30) {
                f2 = f2 + 1;
            } else if (idade <= 45) {
                f3 = f3 + 1;
            } else if (idade <= 60) {
                f4 = f4 + 1;
            } else if (idade > 60) {
                f5 = f5 + 1;
            }
        }

            idade(f1, " 1ª faixa etária");
            idade(f2, " 2ª faixa etária");
            idade(f3, " 3ª faixa etária");
            idade(f4, " 4ª faixa etária");
            idade(f5, " 5ª faixa etária");
            porc1 (f1);
            porc2 (f5);

    }

    public static void idade (int cont, String text) {
        System.out.println("Na" + text + " temos " + cont + " pessoas");
    }
    public static void porc1 (double soma1) {
        System.out.println ("A porcentagem referente a 1ª faixa etária é:" +soma1 100/8);
    }
    public static void porc2 (double soma2) {
        System.out.println("A porcentagem referente a 5ª faixa etária é:" + soma2 100/8);
    }
}