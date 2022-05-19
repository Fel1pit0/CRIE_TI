public class Maior_Menor{
  public static void main(String[] args) {
    int[] n= new int[5];
    int ma=0,me=0; 
    
    System.out.println("Números:");
    for (int i=0; i<n.length; i++){
      n[i]= (int)(Math.random()*100)+1;
      System.out.println("Indice "+i+": " +n[i]);
    } 
    System.out.println("--------------");
    
    for (int i=0; i<n.length; i++){
      if (n[i]>ma){
        ma=n[i];
      }
    }
    for (int i=0; i<n.length; i++){
      if (i==0){
        me=n[i];
      }
      if (n[i]<me){
        me=n[i];
      }
    }
    for (int i=0; i<n.length; i++){
      if (n[i]==ma){
        System.out.println("Indice("+i+") é o maior: "+n[i]);
      }
      if (n[i]==me){
        System.out.println("Indice("+i+") é o menor: "+n[i]);
      }
    }
  }
}