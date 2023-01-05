package smallstudygroup.stringmanipulation;

public class C05_stringManipulation {
    public static void main(String[] args) {
        /*
        Bir String degiskeni olusturunuz ve Strign degiskeninin konsolde bosluk olmayan son
        karekterini yazdiriniz.
         */

        String str="ahmet   furkan   ";
        int sonkarakterIndex=str.trim().length()-1;
        String boslukolmayansonkarakter=str.substring(sonkarakterIndex,sonkarakterIndex+1);
        System.out.println(boslukolmayansonkarakter);
    }
}
