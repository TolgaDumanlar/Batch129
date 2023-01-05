package day10switchloops;

import java.util.Locale;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //Example 2: Size verilen kucuk harfle yazilmis String'in index'i cift sayi
        // olan caharacter'lerini buyuk harf yapiniz

        String s="Ankara";
        for(int i=0; i<s.length();i++){

            String k=s.substring(i,i+1);

            if(i%2==0){
                System.out.print(k.toUpperCase(Locale.ROOT));
            }
        }

    }
}
