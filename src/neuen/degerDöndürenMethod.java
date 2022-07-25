package neuen;

public class degerDöndürenMethod {

    public static void main(String[] args) {

        int sonuc = karesiniAl(12);
        System.out.println("Girilen Sayinin Karesi :"+ sonuc);

        sonuc = ikiSayiyiTopla(987, 1122);
        System.out.println("Girilen Sayinin Toplami :"+ sonuc);

    }

    static int karesiniAl(int sayi){
        int karesi = sayi*sayi;

        return karesi;
    }

    static int ikiSayiyiTopla(int sayi1, int sayi2){
        int toplam = sayi1 +sayi2;

        return toplam;
    }

    static String adSoyadBirlestir(String ad, String soyad){
        String adSoyad = ad + " "+ soyad;



        return adSoyad;
    }
}
