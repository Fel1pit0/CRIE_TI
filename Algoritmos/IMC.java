public class IMC {
  public static void main (String args[]){  
     char sexo= Entrada.leiaChar ("Digite o sexo");
       double altura= Entrada.leiaDouble ("Digite a altura");
         double peso= Entrada.leiaDouble ("Digite o peso");
           double result=0;
                                  result= num (altura,peso);
           System.out.println ("O resultado da operação é:"+result);
}
   public static double num (double a, double p)
        {double r= p/a*2;
            return r;}}
    