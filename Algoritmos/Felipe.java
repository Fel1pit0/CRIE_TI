public class Felipe{ 
  public static void main(String[] args){
    String[] clint= new String[2];
    String[] prodt= new String[2];
    String[] cat= new String[2];
//--------------------------------------------------------------------------------------------------------------------------
    int op= Entrada.leiaInt("[1] Cadastrar clientes\n"+"[2] Cadastrar produtos\n"+"[3] Cadastrar categorias\n"+"[4] Listar clientes\n"+"[5] Listar produtos\n"+"[6] Listar categorias\n"+"[7] Resumo\n"+"[8] Sair\n");
//--------------------------------------------------------------------------------------------------------------------------
    for (int i=0; i<2; i++){
      if (op==1){
        Entrada.leiaString("Digite o nome do cliente");
      }else if (op==2){
        Entrada.leiaString("Digite o nome do produto"); 
      }else if (op==3){
        Entrada.leiaString("Digite o nome da categoria");
      }
    }
//--------------------------------------------------------------------------------------------------------------------------
    for (int i=0; i<1; i++){
      if (op==4){
        System.out.println("Lista dos clientes\n:"+clint[i]);     
      }else if (op==5){
        System.out.println("Lista dos produtos\n:"+prodt[i]);     
      }else if (op==6){
        System.out.println("Lista das categorias\n:"+cat[i]);      
      }
    }
//--------------------------------------------------------------------------------------------------------------------------
    if (op==7){
        System.out.println("Resumo\n");
    }
//--------------------------------------------------------------------------------------------------------------------------
    if (op==8){
      System.exit(0);      
    }
//--------------------------------------------------------------------------------------------------------------------------
  }
}