package atividadesDiarias;

public class InvertendoValorLogico {
  public static void main(String[] args) {
    boolean condicao = true;
    
    System.out.println(condicao); // imprimindo a condição verdadeira
    System.out.println(!condicao);//imprimindo a negação da condição para o valor false
    System.out.println("----invertendo a condição----");
    condicao = !condicao; // invertendo valor da condiçao verdadeira para falsa
    System.out.println(condicao);
    System.out.println(!condicao);
    
  }
}
