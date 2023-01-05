package regular_practice.Exercises;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_Scanner {

    /*

    TechProEd spor salonu icin kullanicidan isim; soyisim; yas;
    kilo;boy;salona devam edecegi ay suresi bilgilerini alip aylik 20 $
    olarak toplam ucreti yazdiriniz

     */

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("TechProEd spor salonuna hosgeldiniz....");
        System.out.println("Lutfen adinizi soyadinizi giriniz...");
        String tamIsim =input.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input.nextByte();

        System.out.println("Lutfen kilonuzu giriniz");
        double kilo=input.nextDouble();
        System.out.println("Lutfen boyunuzu giriniz");
        double boy = input.nextDouble();

        int aylik_Ucret =20;
        System.out.println("aylik_Ucret = " + aylik_Ucret+" $");

        System.out.println("Lutfen uyelik suresini giriniz");
        int aylik =input.nextInt();

        int toplam_tutar =aylik_Ucret*aylik;
        System.out.println("toplam_tutar = " + toplam_tutar+" $");

        System.out.println("tamIsim = " + tamIsim+ "\nYasiniz : "+yas+"\nKilo : "+kilo+"\nBoy : "+boy+
                "\nOdemeniz gereken toplam tutar : "+toplam_tutar+" $");





    }

    public static class C02_Lists {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */

        public static void main(String[] args) {
            List<String> databaseIsim = new ArrayList();
            databaseIsim.add("AYSE");
            databaseIsim.add("AHMET");
            databaseIsim.add("SERDAR");
            databaseIsim.add("OKAN");
            databaseIsim.add("BETUL");
            System.out.println("databaseIsim = " + databaseIsim);
            //databaseIsim = [AYSE, AHMET, SERDAR, OKAN, BETUL]

            Scanner input = new Scanner(System.in);

            // 1.Adim Kullanicidan kullanmak istedigi kullanici adini aliriz

            System.out.println("Lutfen kullanici adinizi giriniz");

            // 2.Adimda kullanicidan aldigim datayi database uygun ve taskin  istedigi gibi bosluksuz hale getirdim
            String username = input.nextLine().toUpperCase().trim();

            //3 .Adimda kullanici adinin kullanilabilir olup olmadigini database ile kiyasliyacagiz

            if(databaseIsim.contains(username)){
                System.out.println("Bu kullanici adi zaten alinmis ");
            }else{
                System.out.println("Bu kullanici adini kullanabilirsiniz");
            }

            if(databaseIsim.contains(username)){
                int rastgeleSayi= new Random().nextInt(100);

                username=username+""+rastgeleSayi;
                System.out.println("Yeni kullanici adi olarak bunu kullanabilirsiniz "+username);
            }else{
                System.out.println("Yeni kullanici adi : "+username);
            }

        }
    }

    public static class C03_Lists {

        public static void main(String[] args) {
            /*
            SAYI TAHMIN OYUNU

            Oyuncudan 1-10 arasi bir sayi isteyiniz
            Elinizdeki listede oyuncunun tahmin ettigi sayi varsa "BINGO" yazdiriniz
            Yoksa verdigi sayiyi listenize ekleyiniz.
            Ilk "BINGO" yu tamamlayana " KAZANDINIZ" yazdiriniz

            [5,8,2,9]  ==> 2 ==> [5,8,BINGO,9]
            [5,8,2,9]  ==> 3  ==>[5,8,BINGO,9,3]
            [5,8,BINGO,9,3] ==> [BINGO,BINGO,BINGO,BINGO,BINGO] ==> KAZANDINIZ
             */


            Scanner input= new Scanner(System.in);
            List<String> c = new ArrayList<>();
            c.add("5");
            c.add("8");
            c.add("2");
            c.add("9");
            System.out.println("c = " + c);//c =c = [5, 8, 2, 9]
            String sayi ="";
            int counter=0;
            do {
                System.out.println("Lutfen 1-10 arasinda bir sayi giriniz");
                sayi= input.next().substring(0,1);

                if(c.contains(sayi)){
                    c.set(c.indexOf(sayi),"BINGO");
                    counter++;

                }else if(!sayi.equals("Q")){
                    c.add(sayi);
                }
                System.out.println(c);

            }while (!(counter == c.size()));
            System.out.println("KAZANDINIZ");

        }
    }

    public static class C04_Lists {
        public static void main(String[] args) {
            // Size verilen ArrayListte 8 (inclusive-dahil) ve
            // 8 den onceki tum elemanlari 2 katina cikariniz


            List<Integer> nums = new ArrayList<>();
            nums.add(1);
            nums.add(2);
            nums.add(3);
            nums.add(4);
            nums.add(5);
            nums.add(6);
            nums.add(7);
            nums.add(8);
            nums.add(9);
            nums.add(10);
            System.out.println("nums = " + nums);//nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

            for (int i = 0;     i <nums.size();            i++) {


                if(nums.get(i) == 8){


                    nums.set(i,nums.get(i)*2);

                    break;
                }
                nums.set(i , nums.get(i)*2);
            }//for
            System.out.println("Degistirlimis List "+nums);//Degistirlimis List [2, 4, 6, 8, 10, 12, 14, 16, 9, 10]
        }
    }

    public static class C05_Lists {

        public static void main(String[] args) {

             /*
          INTERWIEW
         Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
         0-1-1-2-3-5-8-13-21-34....
         */
            List<Integer> fibonacci = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen bir sayi giriniz ");//14
            int sayi = input.nextInt();
            fibonacci.add(0);
            fibonacci.add(1);

            int i = 1;

            if (sayi <= 1) {
                System.out.println("Lutfen 1 den buyuk bir sayi giriniz");
            } else {
                while (fibonacci.get(i) < sayi) {
                    fibonacci.add(fibonacci.get(i) + fibonacci.get(i - 1)); //bir onceki eleman ile topla
                    i++;//bir basamak ilerlesin
                }//while loop
                if (fibonacci.get(fibonacci.size() - 1) > sayi) {
                    fibonacci.remove(fibonacci.size() - 1);
                    System.out.println("Girdiginiz sayi fibonacchi sayisi degildir Girilen sayiya kadar dizi " + fibonacci);
                } else
                    System.out.println("Girdiginiz sayi fibonacchi dizisinde bulunmaktadir"+fibonacci);

            }
        }
    }
}
