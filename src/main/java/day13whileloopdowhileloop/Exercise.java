package day13whileloopdowhileloop;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //Example 2: Verilen bir String'de her harfin sonrasina "*" sembolunu ekleyiniz.

        String a="Java";
        String newWord="";

        int k=0;


        while (k<a.length()){
            newWord=newWord+a.charAt(k)+"*";


            k++;
        }
        System.out.println(newWord);

    }
}
