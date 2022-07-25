package neuen;

public class ParametreAlanMethod {
    public static void main(String[] args) {

        adSoyadYazdir("Ali", "Genc");
        adSoyadYazdir("Fatma", "Ok");

        String ad = "Ahmet";
        String soyad = "Mehmet";

        adSoyadYazdir(ad, soyad);

    }

    static void adSoyadYazdir(String ad, String soyad){
        System.out.println(ad + " "+ soyad);
    }
}
