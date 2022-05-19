public class Media {
  
public static void main(String[] arges) 
{
   double nt1= Entrada.leiaDouble("Digite a primeiro nota");
   double nt2= Entrada.leiaDouble("Digite a segundo nota");
   double nt3= Entrada.leiaDouble("Digite a terceira nota"); 
   
  mediaf (nt1,nt2,nt3); 
  
}       

public static void mediaf (double nota1,double nota2,double nota3)
{double result= (nota1+nota2+nota3)/3;
  if (result >=7)
{ System.out.println("Aprovado!"+result);}
  else
   System.out.println("Reprovado!"+result);
 }
}
