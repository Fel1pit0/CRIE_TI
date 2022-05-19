public class Invertendo_Mat {
  public static void main (String[] args) {
    int[][] mat= new int[5][4];
    int[][] mat2= new int[4][5];
    int temp;
    
    for (int i=0; i<mat.length; i++){
      for (int j=0; j<mat[0].length; j++) {
        mat[i][j]= ((int)(Math.random()*10));
        System.out.print(mat[i][j]+"\t");
      }
      System.out.println("");
    }
    
    System.out.print("----------------------------------\n");
    
    for (int i=0; i<mat.length; i++){
      for (int j=0; j<mat.length; j++){
        mat2[i][j]=mat[i][j];
        System.out.print(mat2[i][j]+"\t");
      }
      System.out.println("");
    }
  }
} 

  


        