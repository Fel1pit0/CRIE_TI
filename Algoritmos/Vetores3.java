public class Vetores3 {

    public static void main(String args[]) {

        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int ind;
        int[] vet3 = new int[20];

        for (ind = 0; ind < 10; ind++) {
            vet1[ind] = (int) (Math.random() * 10) + 1;
            vet2[ind] = (int) (Math.random() * 10) + 1;
        }

        System.out.printf("Vetor A: ");
        for (ind = 0; ind < vet1.length; ind++) {
            System.out.printf(vet1[ind] + "   ");
        }

        System.out.printf("\n\nVetor B: ");
        for (ind = 0; ind < vet2.length; ind++) {
            System.out.printf(vet2[ind] + "   ");
        }

        System.out.printf("\n\nUNINDO...");
        for (ind = 0; ind < 10; ind++) {
            vet3[ind] = vet1[ind];
        }
        for (ind = 10; ind < 20; ind++) {
            vet3[ind] = vet2[ind - 10];
        }

        int cont1, cont2, aux;
        for (cont1 = 0; cont1 < 20; cont1++) {
            for (cont2 = 0; cont2 < 19; cont2++) {
                if (vet3[cont2] > vet3[cont2 + 1]) {
                    aux = vet3[cont2];
                    vet3[cont2] = vet3[cont2 + 1];
                    vet3[cont2 + 1] = aux;
                }
            }
        }

        System.out.printf("\n\nVetor C: ");
        for (ind = 0; ind < vet3.length; ind++) {
            System.out.printf(vet3[ind] + "   ");
        }
    }
}