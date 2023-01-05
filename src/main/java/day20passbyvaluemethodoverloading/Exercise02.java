package day20passbyvaluemethodoverloading;

public class Exercise02 {
    public static void main(String[] args) {
      //100 tl ayakkabi fiyati uzerinden yaslilara yuzde bes ogrencilere yuzde on gazilere yuzde 30 indirim yapan kodu yaziniz


        double ayakkabi=100;


        double ogrenciFiyati=indirim("ogrenci",ayakkabi);
        System.out.println(ogrenciFiyati);

        double yasliFiyat=indirim("yaslilar", ayakkabi);
        System.out.println(yasliFiyat);

        double gaziFiyat=indirim("gaziler",ayakkabi);
        System.out.println(gaziFiyat);

        double polisFiyat=indirim("polis",ayakkabi);
        System.out.println(polisFiyat);

        System.out.println(ayakkabi);
    }

    public static double indirim(String durum, double fiyat){

        switch (durum){
            case "ogrenci":
                fiyat=fiyat*0.90;
                break;
            case "yaslilar":
                fiyat=fiyat*0.95;
                break;
            case "gaziler":
                fiyat=fiyat*0.70;
                break;

            default:
                fiyat=fiyat;

        }
        return fiyat;
    }

}
