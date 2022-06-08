import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        /*
         * Klavyeden iki sayi alan (a ve b) ve bu sayilarin;
         * toplamini (a+b),
         * farkini (a-b),
         * carpimini (a*b),
         * bolumunu (a/b)ve
         * modunu (a%b) ekrana yazdiran program.
         */

        // BU KOD KISMINA DOKUNMAYIN.
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi girin: ");
        int a = input.nextInt();
        System.out.println("Bir sayi daha girin: ");
        int b = input.nextInt();
        input.close();

        // KODUNUZU BURADAN SONRA YAZIN.
        System.out.println("iki sayinin toplami: " + (a+b));
        System.out.println("iki sayinin farki: " + (a-b));
        System.out.println("iki sayinin carpimi: " + (a*b));
        System.out.println("iki saynin bölümü: " + (a/b));
        System.out.println("iki sayinin modu: " + (a%b));


    }
}
