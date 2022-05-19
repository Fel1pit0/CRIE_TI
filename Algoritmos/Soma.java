public class Soma {
    public static void main(String[] args) {

        int[] numeros = new int[8];
        int soma = 0;

        for (int i = 0; i < 8; i++) {
            numeros[i] = -1;
        }

        for (int i = 0; i < 8; i++) {
            soma = soma + numeros[i];
        }

        for (int i = 0; i < 8; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("A soma é: " + soma);

    }

}