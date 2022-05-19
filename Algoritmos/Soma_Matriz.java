public class Soma_Matriz {
  public static void main(String[] args){
    int[][] num= new int [5][5];
    
    
    for (int i=0; i<5; i++){
      for (int j=0; j<5; j++){
        num[i][j]= (int)(Math.random()*100)+1;
      }
    }
    
    
  }
}