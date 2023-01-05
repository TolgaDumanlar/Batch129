package smallstudygroup.stringmanipulation;

public class C01_stringManipulation {
    public static void main(String[] args) {
        /*
        1.replace():karekter degistirmeye yariyor
        2.replaceAll():Karakter data gruplarını degistirmeye yariyor
        3.trim(): bastaki ve sondaki boslukları siler
        4.isEmpty():bos mu diye kontrol eder
        5.isBlack():bosluk olup olmadigini kontrol eder.
        6.toUpperCase()-toLowerCase: buyutmeye ve kucultmeye yarar.
        7.charAt():Stringdeki indexleri aliyor
        8.subString(): ilk indexten ikinci indexe kadar keser (ikinci index dahil degil)
        9.split(): bir Stringi ikiye bolmemize saglar. herhangi bir yerden.
        10.length(): karekter sayisini verir.
        11.contains():icerme durumunu kontrol eder.
        12.startsWith(): ne ile basladigini kontrol eder.
        13.endWith():ne ile sonlandigini kontrol eder.
        14.equals(): esit mi diye kontrol eder.  sayisal deger ve char degerlerini kontrol etmek icin ==
        15.indexOf():girilen karekterin index numarasini verir.
        16.lastIndexOf(): girilen karekterin sondan baslayarak bastan kacinci indexte oldugunu verir.
        17.valueOf():Stringi double cevirmeye yarar.
        */


        //Verilen iki String veriyi karsilastiran Java kodu yaziniz.
        String s1="Hasan";
        String s2="Huseyin";
        System.out.println(s1.equals(s2));


    }

}
