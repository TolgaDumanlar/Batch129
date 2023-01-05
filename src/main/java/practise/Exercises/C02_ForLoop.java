package practise.Exercises;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        /*
            Kullanicidan String bir ifade aliniz.
            Harflerini alt alta gelecek sekilde
            " " bosluk veya 'a ' harfi geldiginde
            yazdirmayan diger karakterleri yazdiran kodu yaziniz */

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen String bir data giriniz");
        String str=input.nextLine();

        for(int i=0;i<str.length();i++){

        if(str.charAt(i)=='a'|| str.charAt(i)==' '){

            continue;

            }//if

            System.out.println(str.charAt(i));

        }//for loop


    }//main
}
