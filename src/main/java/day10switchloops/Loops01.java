package day10switchloops;

public class Loops01 {

    /*

     Code Standarts
     i)Tekrar (Repetition) olmamalıdır.
     ii)Dynamic olmalıdır.
     iii)Tamir(Fix) ve update kolay yapilabilmelidir.

     */

    public static void main(String[] args) {


        //Example 1: Ekrana 5 kere "Hi!" yazdırınız.

        //1.Yol: Tavsiye edilmez.

        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");
        System.out.println("Hi!");

        //2.Yol:
        //Aynı adımlar tekrar tekrar yapılması gerektiğinde "Loop" lar kullanılır
        //Dort tane Loop var ; i)for-loop  ii)while-loop  iii)do-while-loop  iv)for-each-loop

        //i)for-loop
        // Baslangıç degeri    Loop'un calısma sartı  Increment/Decrement
        for(int i=1          ; i<6                   ;   i++              ){

            System.out.println("Hi");
        }
        //Example 2:11 den 44e kadar tum tam sayilari ekrana yazdiran kodu yazdiriniz

        for(int i=11; i<45; i++){
            System.out.print(i);
        }
        //Example 3:40 dan 23e kadar tum cift tam sayilari ekrana yazdiran kodu yazdiriniz
        for (int i=40;i>22;i--){
            if(i%2==0)
            System.out.print(i);
        }
        //Example 4:18'den 56'ya kadar tum tek sayilari ekrana yazdiran kodu yazdiriniz

        for(int i=18;i<57;i++){
            if(i%2!=0)
            System.out.print(i+" ");
        }
    }

}
