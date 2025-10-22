/*
Programa para ler uma frase e imprimir a quantidade de vogais
 */

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        char[] letra;
        String frase;
        int totalVogais= 0;
        char aux;

        System.out.println("Digite uma frase --> ");
        frase = sc.nextLine();

        letra= frase.toCharArray();

        for (int i=0; i< letra.length; i++){
            System.out.print(letra[i]+"\t");
        }
        System.out.println();
        for (char c : letra){
            System.out.print(c+"\t");
        }

        // contagem das vogais da frase

        frase=frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++){

          aux= frase.charAt(i);

          switch (aux){
              case 'a':
              case 'e':
              case 'i':
              case 'o':
              case 'u':
                  totalVogais++;
                  break;
          }

        }
        System.out.println("Total de vogais = " + totalVogais);
    }
}
