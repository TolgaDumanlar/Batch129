package day09incrementdecrementternaryswitch;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //Example 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz
        //           Sunday==>1  . . .  Saturday==>7


             String day="sali";

        switch (day.toLowerCase()){

            case "pazar":
                System.out.println(1);
                break;
            case "Pazartesi":
                System.out.println(2);
                break;
            case "sali":
                System.out.println(3);
                break;
            case"Carsamba":
                System.out.println(4);
                break;
            case "Persembe":
                System.out.println(5);
                break;
            case"Cuma":
                System.out.println(6);
                break;
            case"Cumartesi":
                System.out.println(7);
                break;

                default:
                System.out.println("Gecerli gun giriniz");

        }


    }
}
