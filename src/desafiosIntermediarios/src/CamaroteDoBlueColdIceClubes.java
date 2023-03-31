import java.util.Scanner;

/*
Desafio
No show da famosa banda Blue Cold Ice Cubes o vocalista, Antônio Queda, escolheu todas as
pessoas que estavam na posição impar da fila para entrarem no camarote. Ele fez isso em
diversos shows e as pessoas foram a loucura para competirem por essas posições. Você resolveu
criar um programa para saber, de acordo com o número de pessoas na fila, quantas entrariam no camarote.

Entrada
A entrada será o tamanho da fila que aguardava para ver o show.

Saída
A saída deve ser o número de pessoas que foram colocadas no camarote. (sem as aspas)
 */

public class CamaroteDoBlueColdIceClubes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.


        for(int i = 0; i<= tamanhoDaFila; i++){
            if(i % 2 != 0)
                pessoasNoCamarote++;
        }
        System.out.println(pessoasNoCamarote + " pessoas no camarote");
    }
}