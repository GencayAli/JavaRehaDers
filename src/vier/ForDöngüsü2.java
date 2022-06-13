package vier;

public class ForDöngüsü2 {
    public static void main(String[] args) {

        for (int i = 0; i < -10; i--) {
            System.out.println(i);
        }
        System.out.println("***********************************************************");
        //cift sayilari yazan döngü
        for (int i = 0; i < 15; i+=2) {
            System.out.println(i);
        }

        System.out.println("*************************************************************");

        // disardan verilen degiskenle sayaci toplamak
        int toplam =0;

        for (int i = 0; i < 1000; i++) {
            toplam += i;
        }
        System.out.println("Toplam :" + toplam);
    }
}
