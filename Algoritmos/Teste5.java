public class ler_5itn {
    
    public static void main(String[] args) {
        int[] numeros = new int [5];
        int temp = 0, temp2 = 0;
        
        for (int i = 0; i <numeros.length; i++) {
            numeros[i] = Entrada.leiaInt("Digite o numero");
        }
        
        for (int i = 0; i <numeros.length; i++) {
            System.out.println("indice " + i + "  elemento  " + numeros[i] );
            
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > temp ) {
                temp = numeros[i];
            }
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0) {
                temp2 = numeros[i];
            }
            if (numeros[i] < temp2) {
                temp2 = numeros[i];
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == temp) {
                System.out.println("o numero "+ temp+ " do indice  " + i + " é o maior ");
            }
            if (numeros[i] == temp2)  {
                System.out.println("o numero  " +temp2 + " do indice " + i + " é o menor ");
            }
           
        }
         System.exit(0);
    }
    
}