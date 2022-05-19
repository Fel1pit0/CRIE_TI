class vendas{
  public static void main(String[]args){

    char pagamento;
    int valorvista,valorprazo,valor,parcela;
    valorvista=0;
    valorprazo=0;
    parcela=0;
    for (int i=1; i<=3;i++){
    valor = Entrada.leiaInt("Digite o valor da compra");
    pagamento = Entrada.leiaChar("A forma de pagamento será a vista ou a prazo(V/P)");

    if(pagamento == 'v' | pagamento == 'V'){
    valorvista=(valor+valorvista);
    }
    if(pagamento == 'p' | pagamento =='P'){
    valorprazo=(valor+valorprazo);
    parcela=((valor/3)+parcela);
    }
    }
    pagoavista (valorvista);
    pagoaprazo (valorprazo);
    total (valorprazo,valorvista);
    parcelaprazo (parcela);
  }
  public static void pagoavista(int valorvista){
    System.out.println("O valor total a vista é de "+valorvista);
  }
  public static void pagoaprazo(int valorprazo){
  System.out.println("O valor total a p
                       razo é de "+valorprazo);
  }
  public static void total (int valorprazo, int valorvista){
  int total;
  total=valorprazo+valorvista;
    System.out.println("O valor total é de "+total);
  }
  public static void parcelaprazo (int parcela){
    System.out.println("Valor das primeiras parcelas "+parcela);
  }

}