package regular_practice.daytime07;

public class HacimRunner {
    public static void main(String[] args) {
        //kup,kare,dikdortgen prizmanin hacmini hesapla

        Hacim hacim = new Hacim();//object olusturduk

        int karePrizma = hacim.hacimHesapla(5, 6);
        System.out.println(karePrizma);
        int kup = hacim.hacimHesapla(5);
        System.out.println(kup);
        int dikdortgenPrizma = hacim.hacimHesapla(2, 4, 7);
        System.out.println(dikdortgenPrizma);


    }//main
}//class
