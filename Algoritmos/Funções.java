public class Fun��es
{
    public static void main (String [] args)
    {
        double num1 = Entrada.leiaDouble("Digite o primeiro numero");
        double num2 = Entrada.leiaDouble("Digite o segundo numero");
        double op = Entrada.leiaDouble("Escolha a opera��o que deseja fazer: [ 1 = soma ] [ 2 = subtra��o ] [ 3 = multiplica��o [ 4 = divis�o ]");
        double result=0;
        if(op == 1)
        {
             result=soma (num1,num2);
        }
        if(op == 2)
        {
            result=sub (num1,num2);
        }
        if(op == 3)
        {
             result=multi (num1,num2);
        }
        if (op == 4)
        {
           result=div (num1,num2);
        }
        System.out.println ("O resultado da opera��o �:"+result);
    }

        public static double soma (double n1,double n2)
        {
            double r = n1+n2;
            return r;
        }

        public static double sub (double n1,double n2)
        {
            double r = n1-n2;
            return r;
                    }

        public static double multi (double n1,double n2)
        {
            double r= n1*n2;
          return r;
        }
        public static double div (double n1,double n2)
        {
            double r = n1/n2;
            return r;
        }
    }