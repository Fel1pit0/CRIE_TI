public class Matématica {
  public static void main(String[] args){
    double[] numeros= new double[2];
    
    for (int i=0; i<numeros.length; i++){
      numeros[i]= Entrada.leiaInt("Digite um numero:");
    }
    
    for (int i=0; i<numeros.length; i++){
        System.out.println("\n\n" +numeros[i]);
        System.out.println("Dobro =" +numeros[i]*2);
        System.out.println("Metade =" +numeros[i]/2);
        System.out.println("Raiz =" +Math.sqrt(numeros[i]));  
    
    System.out.printf("\n\nCALMA AÍ.....");
    
        numeros[i]= numeros[i]*3;
        System.out.println("\n\nFinal =" +numeros[i]);
    
    System.out.printf("---------------------------------------------------");
    
    
    }
  }
}