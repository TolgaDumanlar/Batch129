package day19listsvarargs;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {

        //Verilen sayilardan ilki haric tum sayilari
        //toplayip ilk sayiyla carpan bir method olusturunuz (Varargs kullanarak)


        int sayi1 = 10;
        int sayi2 = 7;
        int sayi3 = 2;
        int sayi4 = 4;
        int sayi5 = 9;    //22*5=110

        sonuc(sayi1, sayi2, sayi3, sayi4, sayi5);

    }

    private static void sonuc(int sayi5,int sayi3, int...sonuc) {
        int sum=0;
        for(int w:sonuc){
            sum=sum+w;
        }
       // System.out.println(sum);
        System.out.println(Arrays.toString(sonuc));
    }

}