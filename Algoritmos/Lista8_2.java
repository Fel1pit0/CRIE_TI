public class Lista8_2{
  public static void main(String args[]){
    int[] vet1= new int[8];
    int[] vet2= new int[8];
    int ind;
    int temp;
    
    for (ind=0; ind<8; ind++){
      vet1[ind]= (int)(Math.random()*100)+1;
      vet2[ind]= (int)(Math.random()*10)+1;
    }
    
    System.out.printf("Vetor A: ");
    for (ind=0; ind<vet1.length; ind++){
      System.out.printf(vet1[ind]+" ");
    }  
      
      System.out.printf("\n\nVetor B: ");
    for (ind=0; ind<vet2.length; ind++){
      System.out.printf(vet2[ind]+" ");
    }
    
      System.out.printf("\n\nTrocando...");
    for (ind=0; ind<vet1.length; ind++){
      temp= vet1[ind];
      vet1[ind]= vet2[ind];
      vet2[ind]= temp;
    }
    
      System.out.printf("\n\nVetor A: ");
    for (ind=0; ind<vet1.length; ind++){
      System.out.printf(vet1[ind]+" ");
    }
    
      System.out.printf("\n\nVetor B: ");
    for (ind=0; ind<vet2.length; ind++){
      System.out.printf(vet2[ind]+" ");
    }
  }
}



      
      