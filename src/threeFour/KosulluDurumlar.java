package threeFour;

public class KosulluDurumlar {
    public static void main(String[] args) {

        // örnek 1

        int a = 10, b =10;
        if (a>b){
            // if kosulu treu ise burasi isletilir
            System.out.println("a degeri b degerinden büyüktür. ");
        }
        else if(b>a){
            System.out.println("b degeri a degerinden büyüktür. ");
        }
        else{
            System.out.println("a degeri b degerine esittir.");
        }
        System.out.println("----------------------------------------------------------------------------------------");
        // Örnek 2;
        String ad = "Ahmet";
        int puan = 55;
        boolean devamsiz = false;

        if (ad.equals("Ahmet")){
            if (puan >= 60 && devamsiz == false){
                System.out.println("Gecti");
            }else{
                System.out.println("Kaldi");
            }
        }else{
            System.out.println("Ahmet ögrencisi degilsiniz.");
        }

        // örnek 2 basitlestirme
        if (ad.equals("Ahmet") && puan >= 60 && !devamsiz){

        }
    }
}
