package smallstudygroup.dowhileloop;

import java.util.Random;
import java.util.Scanner;

public class WhileLoop03Anlatim {
    public static void main(String[] args) {
        /*
        bilgisayardan 1 ile 100 arasinda bir sayi tutturun kullanicidan bu sayiyi tahmin etmesini isteyin
        girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu ekrana yazdiran kodu yaziniz.
         */

        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
        Scanner input=new Scanner((System.in));
        int tahmin=0;
        int sayac=1;
        while(sayi!=tahmin){
            System.out.println("Lutfen bir sayi giriniz");
            tahmin=input.nextInt();

            if(tahmin>sayi){
                System.out.println("Kucuk sayi giriniz");
            }else if(tahmin<sayi){
                System.out.println("Buyuk sayi giriniz");
            }
            sayac++;
        }
        System.out.println("Tuttugunuz sayi"+(sayac-1)+"tahminde bildiniz");
    }
}
