public class Vetor{
  public static void main(String args[]){
    double soma;
    double[] vetor= new double[5];
    int contador;
    int acimadamedia;
    double media;
    
    media=soma=contador= 0;
    
    while (contador <5){
      System.out.printf ("Digite uma nota: ");
      vetor[contador]= Entrada.leiaDouble();
      soma+=vetor[contador];
      contador++;
    }
    
    media= soma/5;
    acimadamedia= 0;
    contador= 0;
    
    while (contador <5){
      if (vetor[contador] >media){
        acimadamedia++;
      }
      contador++;
    }
    System.out.println("A média é "+media);
    System.out.println("Alunos acima da média: "+acimadamedia);
  }
}
