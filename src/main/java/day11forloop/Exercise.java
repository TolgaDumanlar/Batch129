package day11forloop;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //Example 2: Size verilen bir String'in "Palindrome" olup olmadigini kontrol eden kodu yaziniz
        //           civic, nalan, kucuk, 11211 ==> Palindrome
        Scanner input=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String s=input.next();
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r=r+s.charAt(i);}

            if(s.equalsIgnoreCase(r)){
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }
    }




