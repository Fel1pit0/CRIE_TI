public class Calc
{
  public static void main (String [] args);
  { 
    double num1= Entrada.leiaDouble("Digite o primeiro numero");
    double num2= Entrada.leiaDouble("Digite o segundo numero");
    double op= Entrada.leiaDouble("Escolha a operação que deseja fazer:[1= soma][2= subtração][3= multiplicação][4= divisão]");
                                    
 if(op== 1) { 
   soma(num1,num2);
 }
                                  
 if(op== 2) { 
   sub (num1,num2);
 }
 
 if(op== 3) { 
   multi (num1,num2);
 }
                                  
 if(op== 4) {
   div (num1,num2);
 }
  }
public static void soma (double n1,double n2)
{double result= n1+n2;
  System.out.println("A soma dos numeros é:"+result);}

public static void sub (double n1,double n2)
{double result= n1-n2;
  System.out.println("A subtração dos numeros é:"+result);}

public static void multi (double n1,double n2)
{double result= n1*n2;
  System.out.println("A multiplicação dos numeros é:"+result);}

public static void div (double n1,double n2)
{double result= n1/n2;
  System.out.println("A divisão dos numeros é:"+result);}
 }