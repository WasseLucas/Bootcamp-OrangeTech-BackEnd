import java.util.Scanner;

/*
Desafio
Sua irmã está com o computador muito lento e pediu para você formata-lo.
Mas ela gostaria muito de que todas as músicas dela fossem salvas e não
deletadas com o resto dos arquivos durante a formatação. Todas as músicas estão no formato .mp3
Crie um programa que cada arquivo com esse formato não seja deletado.

Entrada
A entrada será uma String com o nome da música e seu formato.

Saída
A saída deve ser se o arquivo será salvo ou não.
 */

public class SalvandoMusicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        String arquivo = "arquivo.mp3";

        // TODO: Crie a condição necessária para verificar o formato do arquivo de entrada

        if(arquivoDoPc.contains("mp3")){
            System.out.println("Salvar");
        }else {
            System.out.println("Deletar");
        }
    }
}
