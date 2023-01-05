package advanced_practice.practice03.ex;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //Kullanicidan alinan bir sayidan baslayarak ardisik sayilari 10'un katina gelene kadar yazdiran bir kod yaziniz

        Scanner input=new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");


        int i=input.nextInt();

        while (i%10!=0){

            System.out.println(i);

            i++;
        }


    }
}
