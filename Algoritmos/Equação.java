public class Equa��o
{
   public static void main(String[] args) {
       double num1= Entrada.leiaDouble("Digite o valor de a");
        double num2= Entrada.leiaDouble("Digite o valor de b");
         double num3= Entrada.leiaDouble("Digite o valor de c");
            
   equa��o (num1,num2,num3);
   
   }
public static void equa��o (double a,double b,double c)
{double calc= (-b + Math.sqrt( (b*b)-(4*a*c) ) ) / (2*a);
  System.out.println("O resultado �:" +calc);}
}
