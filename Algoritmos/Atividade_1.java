public class Atividade_1 {
public static void main(String[] args) {

        int[][] matriz = new int[5][6];
        int[] vetor = new int[6];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = ((int) (Math.random() * 10));
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                vetor[i] += matriz[j][i];
            }
        }

        System.out.println("\nA soma das colunas:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "\t"); 
        }

        System.out.print("\n\nA soma de todos valores da matriz: ");
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.print(soma + "\n");

        System.exit(0);

    }
}
