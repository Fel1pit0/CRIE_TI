public class Vetores{
  public static void main(String args[]){
    
    char[] v= new char[5];
    double[] alt= new double[10];
    String[] name_s= new String[12];
    int i;
    
    for (i=0; i<5; i++){
      v[i]= Entrada.leiaChar("Escreva as vogais do alfabeto:");
    }
    for (i=0; i<10; i++){
      alt[i]= Entrada.leiaDouble("Informe a altura dos clientes:");
    }
    for (i=0; i<12; i++){
      name_s[i]= Entrada.leiaString("Escreva o nome dos meses do ano:");
    }
    
    
    System.out.printf("--Vogais do Alfabeto: --\n");
    for (i=0; i<v.length; i++){
      System.out.printf(v[i]+"\n");
    }
    System.out.printf("--Altura dos Clientes: --\n");
    for (i=0; i<alt.length; i++){
      System.out.printf(alt[i]+"\n");
    }
    System.out.printf("--Meses do Ano: --\n");
    for (i=0; i<name_s.length; i++){
      System.out.printf(name_s[i]+"\n");
    }
    System.exit(0);
  }
}