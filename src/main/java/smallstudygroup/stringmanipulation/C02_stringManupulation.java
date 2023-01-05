package smallstudygroup.stringmanipulation;

import java.util.Scanner;

public class C02_stringManupulation {
    public static void main(String[] args) {
        /*Kullanicidan email adresini alınız
        mail@gmail.com icermiyorsa Lutfen gmail adresi giriniz
        @gmail.com ile bitiyorsa email adresiniz kaydedildi
        @gmail.com ile bitmiyorsa lutfen yazimi kontrol edin yazdiran kodu yaziniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gmail adresinizi giriniz");
        String email = input.nextLine();

        if(!email.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresini giriniz");
        } else if (email.endsWith("@gmail.com")){
            System.out.println("Mail adresiniz kaydedildi");
        } else System.out.println("Lutfen yazimi lkontrol ediniz");
    }
}
