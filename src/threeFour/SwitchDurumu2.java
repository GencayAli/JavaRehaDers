package threeFour;

import java.util.Scanner;

public class SwitchDurumu2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Haftanin Günlerinden birini yaziniz ;");
        String gün = input.nextLine();
        input.close();

        switch (gün){
            case "Pazartesi":
                System.out.println("Haftanin ilk günü");
                break;
            case "Sali":
                System.out.println("Haftanin ikinci günü");
                break;
            case "Carsamba":
                System.out.println("Haftanin ucuncu günü");
                break;
            case "Persembe":
                System.out.println("Haftanin dördüncü günü");
                break;
            case "Cuma":
                System.out.println("Haftanin besinci günü");
                break;
            case "Cumartesi":
                System.out.println("Haftanin altinci günü");
                break;
            case "Pazar":
                System.out.println("Haftanin yedinci günü");
                break;
            default:
                System.out.println("Böyle buir gün yok");
                break;
        }
    }
}
