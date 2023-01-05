package freeexercise.konuanlatimi;

import java.util.Scanner;

public class Exercise {
                   /*
         -Iki tane ismim olacak bunlar "Tom Hanks" ve"Ali Can"
        -Bakiye görüntülemek için --1
        -Para çekmek için --2
        -Farkli hesaba para yatırmak için --3
                 */
        public static void main(String[] args) {
            double tomBakiye=2450;
            String tomIBAN="TR:1345 000 767 985 345 6972 76 45";
            String tomKullanici="tom12";
            String tomSifre="123";

            Scanner input=new Scanner(System.in);

            String islemSecenekleri="Bakiye goruntuleme ==>1"+
                                    "Para cekme==>>2"+
                                    "EFT icin==>3";

            double aliBakiye=1250;
            String aliIBAN="TR:1345 4356 656 985 987 6972 76 45";

            System.out.println("Hosgeldiniz");
            System.out.println("Bilgileriniz giriniz");

            System.out.println("Kullanici adini giriniz");
            String kullaniciAdi=input.nextLine();

            System.out.println("Sifre giriniz");
            String sifre=input.nextLine();

            if(kullaniciAdi.equals("tom12")&&sifre.equals(123)){
                System.out.println("Tom Hesabina Hosgeldiniz");
                System.out.println(islemSecenekleri);

                System.out.println("Lutfen secim yapiniz");
                String secim=input.nextLine();

                switch(secim){
                    case "1":
                        System.out.println("Bakiyeniz: "+tomBakiye);
                        break;

                    case "2":
                        System.out.println("Cekmek istediginiz tutari giriniz");
                        int cekilecekTutar=input.nextInt();
                        if(tomBakiye>=cekilecekTutar){
                            tomBakiye-=cekilecekTutar;
                            System.out.println("Kalan tutar"+ tomBakiye);
                        }else {
                            System.out.println("Bakiyenizden buyuk para cekemezsiniz");
                        }
                        break;





                }











            }else{
                System.out.println("Kullanici adi veya sifre hatasi");
            }



        }


}
