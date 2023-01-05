package day05typecastingstringmanipulations;

public class StringManipulations01 {

    //String bir non-primitive data type'dir ve ayni zamanda bir class'dir.

    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1: "s" String'indeki tum character'leri buyuk harf yapiniz.
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);//JAVA IS EASY

        //Example 2: "s" String'indeki tum character'leri kucuk harf yapiniz.
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Example 3: "s" String'indeki ilk character'i aliniz.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Example 4: "s" String'indeki ikinci ve sondan ikinci character'i aliniz ve ekrana yanyana yazdiriniz.
        char secondChar = s.charAt(1);//a
        char secondLastChar = s.charAt(10);//s

        //1.Yol: Ayni satirda yazdirmak icin
        System.out.print(secondChar);
        System.out.println(secondLastChar);

        //2.Yol: Ayni satirda yazdirmak icin
        System.out.println("" + secondChar + secondLastChar);

        //Example 5: "s" String'inde kullanilan karakter sayisini bulunuz.
        int sLength=s.length();
        System.out.println(sLength);

        //Example 6: "s" String'indeki ilk dort karekteri aliniz.

        //substring(0'4)==>"0" yani ilk index dahil, "4" yani ikinci index haricdir.
        String sub1= s.substring(0,4);
        System.out.println(sub1);

        //Example 7: "s" String'indeki "is"kelimesini aliniz.
        String sub2=s.substring(5,7);
        System.out.println(sub2);

        //Example 8: "s" String'indeki "easy" kelimesini aliniz.
        String sub3=s.substring(8,12);
        System.out.println(sub3);
        //Note=Bir karekterden baslayip String'in sonuna kadar almak isterseniz ikinci index'i yazmayiniz.
        String sub4=s.substring(8);
        System.out.println(sub4);

        //Example 9: "s" String'inde "money" kelimesinin var olup olmadigini kontrol ediniz.
        boolean check=s.contains("money");
        System.out.println(check);

        /*
            Bir metod'u ogrenirken 3 seyi mutlaka ogrenin
            i)Bu metod ne is yapar?
            ii)Bu metod'un farkli kullanimlari nasildir?
            iii)Bu metod size ne returm eder?
         */
        //Example 10: "s" String'ini belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isStart=s.startsWith("Java");
        System.out.println(isStart);

        //Example 11: "s" String'inin 6. karekterden itibaren belli bir harfle baslayip baslamadigini kontrol ediniz.
        boolean isbegin=s.startsWith("i",5);
        System.out.println(isbegin);
    }
}
