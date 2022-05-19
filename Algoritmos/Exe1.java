public class Tabuada 
{
public static void main(String[] args) {
     
     int num= Entrada.leiaInt("Digite um numero");
     tab(num);}

public static void tab (int n){
  for (int i = 1; i <= 10; i++)
  System.out.println("" +n + "x" +i "=" n*i);
  }
}
           