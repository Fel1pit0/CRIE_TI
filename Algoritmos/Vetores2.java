public class Vetores2 {
      public static void main (String args []){

    int[] vet1 = new int[10];
    int[] vet2 = new int[10];
    int ind;
    int[] vet3 = new int[10];

    for (ind = 0; ind<10; ind++){
      vet1[ind]=(int)(Math.random()10)+1;
      vet2[ind]=(int)(Math.random()10)+1;
    }

    System.out.printf("Vetor A: ");
    for (ind = 0; ind < vet1.length; ind++){
      System.out.printf(vet1[ind]+"   ");
    }

    System.out.printf("\n\nVetor B: ");
    for (ind=0; ind<vet2.length;ind++){
      System.out.printf(vet2[ind]+"   ");
    }

    System.out.printf("\n\nSOMANDO...");
    for (ind=0; ind<vet3.length;ind++){
      vet3 [ind]=vet1[ind]+vet2[9-ind];
    }

    System.out.printf("\n\nVetor A: ");
    for (ind=0; ind<vet1.length;ind++){
      System.out.printf(vet1[ind]+"   ");
    }

    System.out.printf("\n\nVetor B: ");
    for (ind=0; ind<vet2.length;ind++){
      System.out.printf(vet2[ind]+"   ");
    }

    System.out.printf("\n\nVetor C: ");
    for (ind=0; ind<vet2.length;ind++){
      System.out.printf(vet3[ind]+"   ");
    }
  }
}