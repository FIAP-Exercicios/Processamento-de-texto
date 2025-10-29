import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String palavra, criptografia;
        int deslocamento;

        System.out.println("Digite a palavra--> ");
        palavra= sc.nextLine();
        System.out.println("Digite a posição--> ");
        deslocamento= sc.nextInt();

        criptografia = rotacionarProf(palavra, deslocamento);

        System.out.println(criptografia);
    }
    // MINHA LÓGICA DE CÓDIGO:

    public static String rotacionarGiov(String letras, int delocamento){
        String cripto= "";
        int aux;

        letras= letras.toLowerCase();


        for (int i=0; i< letras.length(); i++){


            aux= letras.charAt(i);
            aux+= delocamento;
            cripto += (char) aux;

            while (aux > 122){

                aux-= 26;

            }
        }
        return cripto;
    }


    //CÓDIGO DO PROFESSOR:

    public static String rotacionarProf(String letras, int delocamento){
        String cripto= "";
        int aux;
        char ch;
        letras= letras.toLowerCase();
        //int desloc = delocamento % 26; --> deslocamento positivo
        int desloc = ((delocamento % 26) + 26) % 26;

        for (int i=0; i< letras.length(); i++){
            ch = letras.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                aux = ch - 'a';
                cripto += (char) ('a' + (aux + desloc) % 26);
            }
            else if (ch >= 'A' && ch <= 'Z') {
                aux = ch - 'a';
                cripto += (char) ('a' + (aux + desloc) % 26);

            }

        }
        return cripto;
    }
}
