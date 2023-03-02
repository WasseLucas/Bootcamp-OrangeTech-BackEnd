package atividadesDiarias;

public class Operadores {
  public static void main(String[] args) {
    int numero1 = 1;
    int numero2 = 2;
    //comparador logico
    boolean simNao = numero1 == numero2 ;

    System.out.println("numeroUm é igual a numero2 ? " + simNao);

    simNao = numero1 != numero2 ;
    System.out.println("numeroUm é igual a numero2 ? " + simNao);

    simNao = numero1 > numero2 ; 
    System.out.println("numeroUm é igual a numero2 ? " + simNao);

    simNao = numero1 < numero2 ;
    System.out.println("numeroUm é igual a numero2 ? " + simNao);

    //controlador de fluxo
    System.out.println("-----Controle de fluxo -----");

    if(numero1 == numero2){
      simNao = numero1 > numero2 ;
      System.out.println(" A nossa condição é vedadeira ");
    }else{
      System.out.println( " Anossa condição é falsa ");
    }
  } 
}
