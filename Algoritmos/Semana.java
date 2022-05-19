public class Semana {
  public static void main (String args[]){   
    int semana;
    semana= Entrada.leiaInt ("Digite um numero entre 1 e 7:");
    while ((semana<1) || (semana>7)) {
      semana= Entrada.leiaInt ("Número INVÁLIDO! Digite um valor entre 1 e 7.");
    }
    System.out.println ("O dia da semana é "+numero(semana));
  }
  
  public static String numero (int num) {
    if (num<=1) {
      return ("SEGUNDA-FEIRA");
    }else if (num<=2) {
        return ("TERCEIRA-FEIRA");
      }else if (num<=3) {
        return ("QUARTA-FEIRA");
       }else if (num<=4) {
        return ("QUINTA-FEIRA");
        }else if (num<=5) {
         return ("SEXTA-FEIRA");
         }else if (num<=6) {
          return ("SABÁDO");
          }else {
            return ("DOMINGO");
          }
  }
}
            