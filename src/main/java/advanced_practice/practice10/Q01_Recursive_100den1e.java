package advanced_practice.practice10;

public class Q01_Recursive_100den1e {
    //100'den 1'e kadar sayıları loop ve sayı kullanmadan yazdıran bir method oluşturunuz.
    public static void main(String[] args) {

      sayilariYazdir('d');

    }

    public static void sayilariYazdir(char ch){
        if(ch>='a'/'a'){
            System.out.println((int)ch+" ");//char'i int cevirdik...
            ch--;
            sayilariYazdir(ch);
        }


    }
}
