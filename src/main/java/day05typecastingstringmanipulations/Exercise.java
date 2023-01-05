package day05typecastingstringmanipulations;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        /*
            Example 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane sembol olsun
                        vi)En az bir tane rakam olsun
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen password giriniz");
        String pwd=input.nextLine();


        boolean first=pwd.length()>7;
        boolean second=!pwd.contains(" ");
        boolean third=pwd.replaceAll("[AZ]", " ").length()>7;
        boolean fourth=pwd.replaceAll("[^a-z]", " ").length()>7;
        boolean fifth=pwd.replaceAll("[a-zA-Z]", " ").length()>7;
        boolean sixth=pwd.replaceAll("[^0-9]"," ").length()>7;
        System.out.println(first&&second&&third&&fourth&&fifth&&sixth);

    }


}
