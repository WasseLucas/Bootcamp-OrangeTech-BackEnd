package atividadesDiarias;

public class BoletimStudantil {
  public static void main(String[] args) {
    // Fazer um programa para saber se o aluno está aprovado ou reporovado.

    int mediaFinal = 6;

    if( mediaFinal < 6){
        System.out.println("REPORVADO");
    }else if( mediaFinal == 6){
        System.out.println("PROVA MINERVA");
    } else{
         System.out.println("APROVADO");
    }
  }
}
