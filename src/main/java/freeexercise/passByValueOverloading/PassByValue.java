package freeexercise.passByValueOverloading;

import java.util.Scanner;

public class PassByValue {
    public static void main(String[] args) {
       /*
        kullanicidan bir int deger alalim ve
        bu degeri 3 katina cikaran bir method olusturalim
        olusturdugumuz degeri method icinde
        ve main method icinde ayri ayri yazdiralim
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Deger giriniz");
        int deger=input.nextInt();






    }
    public static int katlama(int deger){
        return deger * 3;
    }
}
