package freeexercise.methodcreation;

import java.util.Scanner;

public class VoidMethod {
    public static void main(String[] args) {
        /*
        Input olarak verilen satis fiyati, musteri karti var mi? ve uyeligi kac yillik ? bilgilerini degerlendirip
        -uye degilse yüzde 5 indirim
        -uyeliği var ama 5 yıldan az ise yüzde 10 indirim
        -uyeliği var ama 5 yıldan fazla ise yüzde 15 indirim uygulayip
        asil fiyatı, indirim miktarini ve indirimli fiyatı yazdıran bir method oluşturunuz.
         */


        Scanner input=new Scanner(System.in);
        System.out.println("Musteri uye mi?");
        Boolean uyeMi=input.nextBoolean();

        System.out.println("Kac yillik uye?");
        Integer uyelikyili=input.nextInt();

        System.out.println("Urun satis fiyati giriniz");
        Double satisFiyati=input.nextDouble();

        indirimliFiyatHesapla(uyeMi,uyelikyili,satisFiyati);


    }
        public static void indirimliFiyatHesapla(Boolean uyeMi, Integer uyelikYili, double satisFiyati){

        if(uyeMi){
          if(uyelikYili<5){
              System.out.println("Urun satis fiyati :"+ satisFiyati*0.90);
          }else{
              System.out.println("Urun satis fiyati :"+ satisFiyati*0.85);
          }

        }

        }

}
