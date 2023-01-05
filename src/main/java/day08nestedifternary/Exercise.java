package day08nestedifternary;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //Example 1: Kullanicidan iki sayi aliniz "buyuk olmayan"(kucuk veya esit olan) sayiyi yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println("Iki sayi giriniz...");
        double a = input.nextDouble();
        double b = input.nextDouble();

        double result=a<b? a:b;

        System.out.println(result);

        }
    }

