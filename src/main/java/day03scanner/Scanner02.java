package day03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Kullanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdiriniz
        Scanner input=new Scanner(System.in);

        System.out.println("Ilk isminizi giriniz...");
        //next() method kullanicidan tek kelimelik String almak icin kullanilir
        String firstName=input.next();

        System.out.println("Soyisminizi giriniz....");
        String lastName=input.next();

        System.out.println(firstName+" "+lastName);
    }

}