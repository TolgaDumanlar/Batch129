package day05typecastingstringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        String s="Learn Java earn money";

        //Example 1:"s" String'inin "money" ile bitip bitmedigini kontrol ediniz.
        boolean isEnd=s.endsWith("money");
        System.out.println(isEnd);

        //Example 2:"s" String'deki "money" kelimesini "dolar" kelimesine ceviriniz.
        String replace=s.replace("money","dolar");
        System.out.println(replace);

        //Example 3:"s" String'deki "earn" kelimesini "win" kelimesine ceviriniz.
        String s2=s.replace("earn","win");
        System.out.println(s2);

        //Example 4:"s" String'deki "a" harflerini "*"a ceviriniz.
        String s3=s.replace("a","*");
        System.out.println(s3);

        //Example 5:"s" String'deki "n" harflerini "xxx"e ceviriniz.
        String s4=s.replace("n","xxx");
        System.out.println(s4);

        //Example 6:"s" String'deki "e" harflerini siliniz.
        String s5=s.replace("e","");
        System.out.println(s5);

        String t="Ali 13 yasindadir!...";

        //Example 7:"t" String'deki tum rakamlari "*"a ceviriniz.
        //Note:Bir grup datayi degistirmek icin replaceAll() kullanilir.
        //Note;Bir gru data'yi ifade etmek icin "Regular Expression" (Regex) kullaniriz.
        String t1= t.replaceAll("[0-9]", "*");
        System.out.println(t1);

        /*
                    Meshur Regex'ler
            1)Tum rakamlar==>[0-9]
            2)Tum kucuk harfler==>[a-z]
            3)Tum buyuk harfler==>[A-Z]
            4)Tum kucuk ve buyuk harfler==> [a-zA-Z]
            5)Tum noktalama isaretleri==> \\p{Puncht}
            6)Tum sesli harfler==>[aeiou]
                x, q, w harfleri==>[xqw]

            7)Kucuk harflerden farkli tum karekterler ==>[^a-z]
            8)Tum harflerden farkli tum karekterler==>[]^a-zA-Z]

         */

        //Example 8:"t" String'deki tum rakamlari ve harflerini "!"e ceviriniz.
        String t2=t.replaceAll("[0-9a-zA-Z]","!");
        System.out.println(t2);

        //Example 9:"t" String'deki tum sesli harfleri "?"e ceviriniz.
        String t3=t.replaceAll("[AEIOaeio]","?");
        System.out.println(t3);

        //Example 10:"t" String'deki kucuk harfler disindaki tum karekterleri "<>"e ceviriniz.
        String t4=t.replaceAll("[^a-z]","<>");
        System.out.println(t4);

        //Example 11:"t" String'deki tum harfler disindaki tum karekterleri "+"e ceviriniz.
        String t5=t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);

        //Example 12:"t" String'deki "space" disindaki tum  karekterleri "TL"e ceviriniz.
        String t6=t.replaceAll("[^ ]","TL");
        System.out.println(t6);

        //Example 13:"t" String'deki sesli harfler disindaki tum  karekterleri "&"e ceviriniz.
        String t7=t.replaceAll("[^aeioAEIO]","&");
        System.out.println(t7);

    }
}
