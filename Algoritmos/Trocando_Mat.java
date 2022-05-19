//Criar um programa que faça a leitura de uma matriz 5x4. 
//Troque os elementos da coluna 1 pelo coluna 3 e troque os elementos da coluna 0 pela coluna 2.
//Apresentar a matriz original e a matriz trocada. 

public class Trocando_Mat {
  public static void main (String[] args) {
    int[][] mat= new int [5][4];
    int temp; 
    
    for (int i=0; i<mat.length; i++){
      for (int j=0; j<mat[0].length; j++) {
        mat[i][j] = ((int) (Math.random() * 10));
      }
    }
    
    for (int i=0; i<mat.length; i++){
      for (int j=0; j<mat[0].length; j++) {
        System.out.print(mat[i][j] + "\t");
      }
      System.out.println();
    }
    
    System.out.println("------------------------------------------------------------------");
    
    
    for (int i=0; i<temp.length; i++){
      for (int j=0; j<mat[0].length; j++){
        temp[i]= mat[i][0];
      }
    }
    for (int i=0; i<mat.length; i++){
      for (int j=0; j<mat2[0].length; j++){
        mat[i][0]=mat2[i][2];
      }
    }
    for (int i=0; i<temp.length; i++){
      for (int j=0; j<mat2[0].length; j++){
        mat[i][0]=temp[i];
      }
      
    }
  }
}