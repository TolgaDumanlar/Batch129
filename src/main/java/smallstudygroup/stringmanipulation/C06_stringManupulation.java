package smallstudygroup.stringmanipulation;

public class C06_stringManupulation {
    public static void main(String[] args) {
        /*
        sadece tek kelimeden olusan sehir isimleri icin bir String degiskeni olusturun. sehir
        ismini, bas harfi buyuk ve diger tum karakterleri kucuk harfler olacak sekilde konsolde
        yazdırın.
         */

        String sehirIsmi="aNKARA";
        String str=sehirIsmi.trim().toUpperCase();
        str=str.substring(0,1)+str.substring(1).toLowerCase();
        System.out.println(str);
    }
}
