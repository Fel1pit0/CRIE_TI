public class ExMatrizes {
    public static void main(String[] args) {
        int[][] mat = new int[5][6];
        int[] vet = new int[5];
        int soma = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = (int)(Math.random()*10)+1;
            }
        }
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < mat.length; i++) {
            soma = 0;
            System.out.print("");
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + "\t" + "");
                soma = soma + mat[i][j];
            }
            vet[i] = soma;
            System.out.print("=\t" + vet[i] + "");
            System.out.println();
            System.out.println("-------------------------------------------------------------------");
        }
    }
}