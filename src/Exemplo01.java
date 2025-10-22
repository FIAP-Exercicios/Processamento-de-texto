import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1, s2;
        int x;


        System.out.println("Palavra --> ");
        s1=sc.next();
        System.out.println("Valor -->");
        x= sc.nextInt();
        sc.nextLine();
        System.out.println("Frase --> ");
        s2=sc.nextLine();

        System.out.println(s1 + "\n " + s2 + "\n" + x);

    }
}
