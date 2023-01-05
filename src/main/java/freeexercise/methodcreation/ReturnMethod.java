package freeexercise.methodcreation;

import java.util.Scanner;

public class ReturnMethod {
    public static void main(String[] args) {
        /*
        Input olarak verilen isim ve soyismi ilk harfleri buyuk, diğer harfleri kuçu olarak değiştirip
        programın sonraki bölümlerinde kullanabilmek uzere isimSoyisim variable'na atayacak bir method
        olusturunuz.
        input-Isim :ALI, Soyisim:CAN
        Output-isimSoyisim: Ali Can
         */

        String isim="BULENT";
        String soyIsim="YILMAZ";

        String isimSoyisim=isimDuzenle(isim, soyIsim);

        System.out.println("Ilk girilen"+ isim+ soyIsim);

        System.out.println(isimSoyisim);
    }

    private static String isimDuzenle(String isim, String soyIsim) {

        String isimDuzenlenmis=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        String soyIsimDuzenlenmis=soyIsim.substring(0,1)+soyIsim.substring(1).toLowerCase();

        return isimDuzenlenmis + "   "+soyIsimDuzenlenmis;

    }


}

