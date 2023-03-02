package atividadesDiarias;

import java.util.Scanner;
// Fazer um programa para comparar o valore de A e B, Ultilizando operador ternário.
public class OperdorTernario {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int valorA = sc.nextInt();
    int valorB = sc.nextInt();

    String resultado = valorA == valorB ? "verdadeiro" : "falso";

    System.out.println(resultado);

    sc.close();
  }
}
