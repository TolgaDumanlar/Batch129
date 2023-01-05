package freeexercise.konuanlatimi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KonuAnlatimi {
    public static void main(String[] args) {
        // Ali Can:IBAN TR:1234 000 567 985 345 6572 23 45
        // Alinin kullanici adi ve sifresi; ali55--456

        //Tom Hanks:IBAN TR:1345 000 767 985 345 6972 76 45
        //Tom'un kullanici adi ve sifresi; tom12--123

        /*

        -Bakiye görüntülemek için --1
        -Para çekmek için --2
        -Farkli hesaba para yatırmak için --3
                 */
        String islemSecenekleri = "Bakiye goruntuleme-->1" +
                "Para cekme-->2" +
                "Farkli hesaba para yatirma -->3";

        Scanner input = new Scanner((System.in));


        double tomBakiye = 2450;
        String tomIBAN = "TR:1345 000 767 985 345 6972 76 45";
        String tomKullanici = "bilal12";
        String tomSifre = "123";

        double aliBakiye = 1250;
        String aliIBAN = "TR:1234 000 567 985 345 6572 23 45";
        String aliKullanici = "enes55";
        String aliSifre = "456";

        System.out.println("Hosgeldiniz");
        System.out.println("Lutfen bilgilerinizi giriniz");

        System.out.print("Kullanici adi:  ");
        String kullaniciAdi = input.nextLine();

        System.out.print("Sifre:  ");
        String sifre = input.nextLine();

        if (kullaniciAdi.equals("tom12") && sifre.equals("123")) {
            System.out.println("Tom Hanks Hesabina giris yapildi");
            System.out.println(islemSecenekleri);

            System.out.print("Lutfen bir secim yapiniz:   ");
            String secim = input.nextLine();
            switch (secim) {
                case "1":
                    System.out.println("Bakiyeniz :" + tomBakiye);
                    break;

                case "2":
                    System.out.print("Cekmek istediginiz tutari giriniz:  ");
                    int cekilecekTutar = input.nextInt();
                    if (tomBakiye >= cekilecekTutar) {
                        tomBakiye -= cekilecekTutar;
                        System.out.println("Kalan tutar:" + tomBakiye);
                    } else {
                        System.out.println("Bakiyenizden fazla para cekemezsiniz");
                    }
                    break;

                case "3":
                    System.out.println("Ne kadar yatirmak istiyorsunuz:");
                    int yatirilacakTutar = input.nextInt();
                    if (yatirilacakTutar <= tomBakiye) {
                        System.out.print("Iban giriniz: ");
                        input.nextLine();
                        String yatirilacakIBAN = input.nextLine();
                        if (yatirilacakIBAN.equals(aliIBAN)) {
                            System.out.println("Para Ali Can'a yatiriliyor");
                            tomBakiye -= yatirilacakTutar;
                            aliBakiye += yatirilacakTutar;

                            System.out.println(" Tomun hesabinda olan para:"+tomBakiye);
                            System.out.println(" Alinin hesabinda olan para:"+aliBakiye);
                        }
                    } else if(yatirilacakTutar>tomBakiye){
                        System.out.println("Yatirilacak tutar hesaptaki paradan buyuk olamaz");
                        break;
                    }
                    break;
            }
        } else if (kullaniciAdi.equals("ali55") && sifre.equals("456")) {
            System.out.println("Ali Can Hesabina giris yapildi");
            System.out.println(islemSecenekleri);
        } else {
            System.out.println("Kullanici adiniz veya sifreniz hatali");

        }

    }
}
