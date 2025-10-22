import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Qplavaras;

        System.out.println("Quantas palavras você vai digitar?");
        Qplavaras= sc.nextInt();
        String[] Palavras= new String[Qplavaras];

        lerpalavras(Palavras);
        LocalizarPar(Palavras);


    }
    public static void lerpalavras(String[] palavra){
        Scanner sc= new Scanner(System.in);
        for (int i=0; i< palavra.length;i++){
            System.out.println("Palavra --> ");
            palavra[i] = sc.next();
        }

    }
    public static void LocalizarPar(String[] palavra){
        String inverso;
        boolean achou = false;

        for (int j=0; j< palavra.length; j++){
            inverso = Inverter(palavra[j]);
            for (int i= j+1; i < palavra.length; i++){
                if (inverso.equalsIgnoreCase(palavra[i])){

                    System.out.println("("+ palavra[j] + "," + palavra[i] + ")");
                    achou= true;
                }
            }
        }
        if (achou==false){

            System.out.println("NÃO ACHEI");

        }

    }
    public static String Inverter(String palavra){
        char aux;
        int j= palavra.length() -1;
        char[] letra = palavra.toCharArray();

        for (int i=0; i < letra.length / 2; i++){
            aux= letra[i];
            letra[i]=letra[j];
            letra[j]=aux;
            j--;
        }
        return new String(letra);
    }
}
