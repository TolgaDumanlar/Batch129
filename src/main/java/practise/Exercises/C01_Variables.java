package practise.Exercises;

public class C01_Variables {

    public static void main(String[] args) {


        //1)TECHPRO EDUCATION ==> her bir harf alt alta gelecek sekilde yazdiran kodu olusturunuz.

        System.out.println("*************1. YOL**********");
        System.out.println("T");
        System.out.println("E");
        System.out.println("C");
        System.out.println("H");
        System.out.println("P");
        System.out.println("R");
        System.out.println("O");
        System.out.println("");//HICLIKTE OLUR
        System.out.println("E");
        System.out.println("D");
        System.out.println("U");
        System.out.println("C");
        System.out.println("A");
        System.out.println("T");
        System.out.println("I");
        System.out.println("O");
        System.out.println("N");
        /*
        \n ==> alt satira gecirir
        \t ==> bir tab bosluk birakir
        \b ==> gerisindeki ilk harfi siler
        ctrl+ alt +l ==> windows icin sayfayi duzenler
        cmd + alt +l ==> mac icin sayfayi duzenler
         */

        //2)yukaridaki ornegi tek sout ile her harf alt alta gelecek sekilde yazdirin
        System.out.println("************2.Yol******************");
        System.out.println("\nT\nE\nC\nH\nP\nR\nO\n\nE\nD\nU\nC\nA\nT\nI\nO\nN");

        //3) JAVA ILE GUZEL DUNYA her bir kelimeyi alt satira yazdiracak sekilde kodu create ediniz

        System.out.println("\nJAVA\nILE\nGUZEL\nDUNYA");
        System.out.println("JAVA");
        System.out.println("ILE");
        System.out.println("GUZEL");
        System.out.println("DUNYA");

        //4) JAVA ILE GUZEL DUNYA seklinde kelimeler arasinda 1 tab bosluk birakan kodu yaziniz
        System.out.println("JAVA\tILE\tGUZEL\tDUNYA");

        //5) pazartesi kelimesinin her bir harfini alt satirda yazdiracak sekilde tek sout ile kodu create ediniz
        System.out.println("\np\na\nz\na\nr\nt\ne\ns\ni");
        //Soru-6 : "Techpro" ile java cok 'kolay'
        // yazdiran bir kod yaziniz

        System.out.println("\"Techpro\"\tile\tjava\tcok\t'kolay'");
        //Soru-7 : "MAHARET" hic 'DUSMEMEK'  degil;


        // "Her dustugunde kalkabilmektir" ==>ifadesini

        //      seklinde noktali virgulden
        //      sonra 3 satir asagidan ve satir basi yaparak
        //      yazdiran bir kod yaziniz.

        System.out.println("\"MAHARET\" hic\t'DUSMEMEK'\tdegil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");

    }

    public static class C06_Varargs {

        public static void main(String[] args) {

            /*

            Farkli parametreler ile calisabilen methodlar olusturmak icin varargs'lar kullanilir
            Varargs'larin arka tarafinda Array'ler calisir
            Varargs nasil olusturulur.( Data type...  varargs ismi) veya ( Data type  ...varargs ismi)
            Varargs en sonda olmak sartiyla  bir method olustururken farkli data type'lari kullanilabilir****
            Varargs 'lar bir methodda birden fazla kullanilamaz == unreachable code olur
             */

            ikiSayiyiTopla(2, 3);
            ucSayiyiTopla(6, 8, 14);
            dortSayiyiTopla(56, 96, 40, 30);

        }

        private static int dortSayiyiTopla(int i, int i1, int i2, int i3) {

            return i + i1 + i2 + i3;
        }

        private static int ucSayiyiTopla(int i, int i1, int i2) {
            return i + i1 + i2;
        }

        private static int ikiSayiyiTopla(int i, int i1) {
            return i + i1;
        }

        private static int add(String str,int... a) {
            int sum = 0;  //  int... a,String str unreachable code == ulasilamaz kod
            for (int w : a) {
                sum = sum + w;

            }
            return sum;
        }
    }
}