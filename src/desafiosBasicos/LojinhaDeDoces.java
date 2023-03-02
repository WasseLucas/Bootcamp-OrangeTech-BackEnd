import java.util.Scanner;

/*
  Desafio
  Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola.
  Para aumentar as vendas o dono resolveu colocar uma máquina onde os clientes,
  principalmente as crianças que estão muito acostumadas com a tecnologia, poderiam
  colocar suas moedas e receber dois doces aleatórios. Cada 1 real irá render 2 doces
  aleatórios.

  Entrada
  A entrada será a quantidade de dinheiro que cada cliente, um por vez, possui.

  Saída
  A saída deverá ser a quantidade de doces que cada cliente conseguiu obter. (sem as aspas)

  Exemplo
  Entrada	        Saída
    10	      "O cliente obteve 20 doces" 
    20	      "O cliente obteve 40 doces"
    40	      "O cliente obteve 80 doces"
 */

public class LojinhaDeDoces {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int dinheiro = sc.nextInt();
        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada
        System.out.println("O cliente obteve "+ dinheiro * 2 + " doces");

  }
}