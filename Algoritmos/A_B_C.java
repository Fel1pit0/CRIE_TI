public class A_B_C{
  public static void main(String args[]){
    //
    int[] A= new int[2];
    int[] B= new int[2];
    int[] C= new int[2];
    int soma=0;
    //
    for (int i=0; i<2; i++){
      A[i]= Entrada.leiaInt("Digite 10 números pro vetor A:");
      System.out.printf("Indice("+i+"):" +A[i]+"\n");
    } 
    System.out.printf("--------------------------------------\n");
    
    for (int i=0; i<2; i++){
      B[i]= Entrada.leiaInt("Digite 10 números pro vetor B:");
      System.out.printf("Indice("+i+"):" +B[i]+"\n");
    }
    
    System.out.printf("--------------------------------------\n");
    
     System.out.printf("Somando!!....\n");
    for (int i=0; i<2; i++){
      soma=A[i]+B[i];
      C[i]=soma;
      System.out.printf("Indice("+i+"):" +C[i]+"\n");
    }
     for (int i=1; i>=0; i--){
      System.out.printf(B[i]+" ");
    }
  }
}