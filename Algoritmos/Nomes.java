public class Nomes {
  public static void main(String[] args){
    String[] nomes= new String[5];
    int a=0;
    //----------------
    nomes[0]= "Pedro";
    nomes[1]= "Paulo";
    nomes[2]= "Maria";
    nomes[3]= "Carlos";
    nomes[4]= "Matheus";
    //----------------

System.out.println("---------------");
     
     for (int i=0; i<nomes.length; i++){
       for (int j=0; j<nomes[i].length(); j++){
       if(nomes[i].charAt(j) == 'a'){
        a++;
           }
        }
     }
System.out.println("Total: "+a);

System.out.println("---------------");
  }
}
    
    