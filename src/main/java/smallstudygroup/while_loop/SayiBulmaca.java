package smallstudygroup.while_loop;

import java.util.Random;
import java.util.Scanner;

public class SayiBulmaca {

    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        Random rnd = new Random();


        int sayi =rnd.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz");
        int tahmin=0;
        int counter=0;
        while (sayi!=tahmin){
            tahmin=input.nextInt();
            if (tahmin>sayi){
                System.out.println("Daha kucuk bir sayi Girniz.");
            } else if (tahmin<sayi) {
                System.out.println("Daha Buyuk bir Girniz");
            }
            counter++;
        }

        System.out.println("Tutugunuz sayi  "+counter + " tahmin de bulundunuz ");

    }
}