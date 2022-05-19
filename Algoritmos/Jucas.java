public class Jucas {
  public static void main(String[] args){
    String[] nomes= new String[5];
    int juca=0;
    
    for (int i=0; i<5; i++){
      nomes[i]= Entrada.leiaString("Informe um nome:");
      
      if(nomes[i].equalsIgnoreCase("juca")){
        juca++;
      }
    }   
    
    System.out.println("O total de Juca's é: " +juca);
    for (int i=0; i<5; i++){ 
      System.out.println(nomes[i]);
    }
  }
}