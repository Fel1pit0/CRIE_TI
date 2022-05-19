public class Trocando{
  public static void main(String args[]){
    int[] A= new int[10];
    int[] B= new int[10];
    int[] C= new int[10];
    int ind;
    
    for (ind= 0; ind<10; ind++){
      A[ind]= (int)(Math.random()*100)+1;
      B[ind]= (int)(Math.random()*10)+1;
      C[ind]= A[ind]+B[ind];
    }
      
      System.out.printf("Vetor A: ");
    for (ind=0; ind<A.length; ind++){
      System.out.printf(A[ind]+" ");
    }
      
      System.out.printf("\n\nVetor B: ");
    for (ind=0; ind<B.length; ind++){
      System.out.printf(B[ind]+" ");
    }
    
    System.out.printf("\n\nSomando A e B...");
    
      System.out.printf("\n\nVetor C: ");
    for (ind=0; ind<C.length; ind++){
      System.out.printf(C[ind]+" ");
    }
  }
}
