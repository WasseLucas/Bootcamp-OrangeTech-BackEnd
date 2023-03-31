import java.util.Scanner;
/*
Desafio
O seu amigo quer verificar quais os imóveis estão disponíveis em uma certa corretora na região onde ele mora.
A corretora disponibilizou uma API para ele, mas como ele não entende nada de programação, pediu a sua ajuda.
Para deixar tudo bonitinho, você resolveu criar um aplicativo para seu querido amigo, mas quando foi olhar a API
retornava os dados de uma forma esquisita, separado por barras. Ajude seu amigo deixando a informação mais amigável possível.

Entrada
A entrada será a classificação do imóvel, o valor do aluguel dele e se ele está disponível no momento.

Saída
A saída deverá ser as informações da entrada, porém de uma forma mais amigável. (sem as aspas)
 */

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];

        // TODO: Crie a condição necessária para remover as barras da String e apresentar de forma mais amigável
        array = frase.split("/");
        System.out.print("Imovel: " + array[0] +" "+ "R$"+ array[1] + " " + array[2]);
    }
}
