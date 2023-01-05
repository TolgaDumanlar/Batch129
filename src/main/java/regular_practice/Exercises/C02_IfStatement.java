package regular_practice.Exercises;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        /*
        Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz 4 islemden biri ile
        isleme koyup yazdiriniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen\n toplama yapmak icin 1, \ncikarma yapmak icin 2, \ncarpma yamak icin 3,\nbolme yapmak icin 4 \ngiriniz");
        int islem = input.nextInt();
        System.out.println("Lutfen iki tam sayi giriniz");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        if (islem == 1) {
            System.out.println("Toplama isleminin sonucu:" + num1 + "+" + num2 + "=" + (num1 + num2));
        } else if (islem == 2) {
            System.out.println("Cikarma isleminin sonucu:" + num1 + "+" + num2 + "=" + (num1 - num2));
        }else if (islem == 3) {
            System.out.println("Carpma isleminin sonucu:" + num1 + "+" + num2 + "=" + (num1 * num2));
        }else if (islem == 4) {
            System.out.println("Bolme isleminin sonucu:" + num1 + "+" + num2 + "=" + (num1 / num2));
        } else
            System.out.println("Hatali secim yaptiniz, lutfen tekrar deneyiniz");




        }
    }