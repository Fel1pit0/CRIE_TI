public class Nadador {
  public static void main (String args[]){   
    int idade;
    idade= Entrada.leiaInt ("Digite a idade do nadador:");
    while ((idade<5) || (idade>120)) {
      idade= Entrada.leiaInt ("Idade INVÁLIDA! Digite um valor entre 5 e 120.");
    }
    System.out.println ("O nadador é da categoria "+categoria(idade));
  }
  
  public static String categoria (int num) {
    if (num<=7) {
      return ("INFANTIL A");
    }else if (num<=10) {
        return ("INFANTIL B");
      }else if (num<=13) {
        return ("JUVENIL A");
       }else if (num<=17) {
        return ("JUVENIL B");
        }else {
        return ("ADULTO");
    }
  }
}