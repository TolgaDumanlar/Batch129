package day01variables;

public class Variables01{
    public static void main(String[] args) {
        //Variable olusturmak
        //Java cumlesi =Statement
        //Java`da esittir demek "==". Yani Matematik`de "=" Java`da "=="
        //Java`da "=" "assigmnet operator"dir. Sagdaki degeri alir soldaki kutuya yazar.
        //Access modifier yazmazsaniz bu "default" demektir.
        //Data Type+Variable Name ==>Variable Declaration
        //Assignment operator (Atama operatoru)+Variable degeri==>Assignment
        //Eger Variable Declaration yapar, Assignment yapmazsaniz Java kendi degerini (default) koyar.
        //Default degerler sayilar icin sifirdir.
        // Data type`ni yaziniz  Variable ismini yaziniz   Atama(Assignment) operatoru  Variable degeri Java bitti demek
            int                  age                       =                            13               ;
         //Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz
        //Stringlere verilen degerler cift tirnak icinde olmalidir.
        //Stringlet icin "default value" "nll" dir.
            String studentName = "Ali Can" ;
   /*
   Java`da temelde iki tip data vardir.
   1)primitive data type:
   char:Tek karakterler icin kullanilan data tipidir. A, x, ?, 5
   boolean:booleanlar sadece iki farkli deger alabilir; true veya false.
   byte:-128'den 127'ye kadar tam sayi degerleri icin kullanilir. (1 byte)
   short:-32768 ile +32762 arasindaki tam sayilar icin kullanilir.(2 byte)
   int: -2147483648 ile 2147483647 arasindaki sayilar icindir.(4 byte)
   long: Araligi cok korkunc katrilyon.(8 byte)
   floot:
   double:
   2)non-primitive date type
    */
        //Ornek2:char date tipinde ilk ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz
        //Note:Char date tipinde degerler tek tirnak icine konulmalidir
        char isminIlkharfi = 'A';
       // Ornek 3: boolean data tipinde emeklimisin data tipini olusturun ve false degerini atayin
        boolean emeklimisin = false;
        //Ornek 4: byte data tipinde ogrenci yasi icin bir variable olusturunuz ve deger atayiniz
        byte studentAge = 23;
        //Ornek 5:Site nufusu icin bir variable olusturup deger atayiniz/
        short siteNufusu = 1948;
        //Ornek 6:Ulke nufuslari icin bir variable olusturup deger atayiniz
        int countryPopulition = 1545342545;
        //Ornek 7: Insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        long humanCellNumber = 1264546464747373L;
    }

}
