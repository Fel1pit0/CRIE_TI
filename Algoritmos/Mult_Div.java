public class Mult_Div{
  public static void main(String[] args) {
    int[] n = new int[10];
    
    for (int i = 0; i < n.length; i++) {
      n[i]= (int)(Math.random()*100)+1;
      System.out.println("Elemento (indice "+i+"): "+n[i]);
    }
    System.out.println("---------------------------------------------------------------------------------------");
    for (int i = 1; i < n.length; i++) {
      if (i % 2 == 0) {
        System.out.println("Elemento (indice "+i+") multiplicado por 2: "+n[i]*2);
      }
    }
    System.out.println("---------------------------------------------------------------------------------------");
    for (int i = 1; i < n.length; i++) {
      if (i % 5 == 0) {
        System.out.println("Elemento (indice "+i+") multiplicado por 5: "+n[i]*5);
      }
    }
  }
}