package aajavarepeat.day03scanner;

import java.util.Scanner;

public class Scanner01 {

    //Kullanicidan data alip kullanacagiz

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int age=input.nextInt();

        Scanner input1=new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String name= input.next();
        System.out.println("Soyadinizi giriniz");
        String surname=input.next();
        System.out.println(name+surname);

    }


}
