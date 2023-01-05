package practise.Exercises;

import java.util.Scanner;

public class Q04_FrequencyOfCertainChar {
    /*
    Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Tekrar Sayisi = 3

     */
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("bir isim giriniz");
        String kelime=input.next();
        System.out.println("Bir harf giriniz");
        char karekter=input.next().toLowerCase().charAt(0);

        byte sayac=0;

        for(int i=0; i<kelime.length();i++){

           if(kelime.charAt(i)==karekter){
               sayac++;
           }

        }

        System.out.print(sayac);

    }

}