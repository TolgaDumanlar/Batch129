package smallstudygroup.stringmanipulation;

import java.util.Scanner;

public class C03_stringManupulation {
    public static void main(String[] args) {
        /*
        Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        "kucuk" kelimesi iceriyorsa tum cummeyi kucuk harf olarak yazdiran,
        iki kelimeyi de icermiyorsa mail@gmail.com
        iki kelimeyi de iceriyorsa "karar ver buyuk mu yazdirayim, kucuk mu?" yazdirin.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen cumle giriniz");
        String str=input.nextLine();

        //Java soldan saga calistigi icin ilk buyuk gordugu anda kodu yazip geciyor onun
        //icin en basa sinirlandirici durumu yazdirmamiz lazim

        str=str.toLowerCase();//en basta buyuk kucuk olayina karar ver

        if(str.contains("buyuk"))
        {System.out.println(str.toUpperCase());
        }
        else if (str.contains("kucuk")) {
            System.out.println(str.toLowerCase());
        }
        else if((str.contains("buyuk"))&& (str.contains("kucuk"))){
            System.out.println("ikisi de yok");
        } else {
            System.out.println("Karar ver");
        }

    }
}
