package regular_practice.practice03;

import java.util.Scanner;

public class Q01_WhileLoop {
    public static void main(String[] args) {
        //Kullanicidan alinan bir sayidan baslayarak ardisik sayilari 10'un katina gelene kadar yazdiran bir kod yaziniz
        //orn:Girilen Sayi:46 Cikti:46,47,48,49
        Scanner input=new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int sayi=input.nextInt();
        while(sayi%10!=0){
            System.out.println(sayi+" ");
            sayi++;
        }






    }
}
