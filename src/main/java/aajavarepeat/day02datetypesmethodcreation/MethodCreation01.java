package aajavarepeat.day02datetypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {

        int sonuc =add(3,5);

        System.out.println(sonuc);

        System.out.println(  multiply(3,6));

        int sonuc2=ilkIkiCarpUcuncuTopla(5,4,8);
        System.out.println(sonuc2);

        double kupSonuc=kup(1.4);
        System.out.println(kupSonuc);
    }

    public static int add(int a, int b){
        return a+b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int ilkIkiCarpUcuncuTopla(int a, int b, int c){
        return  (a*b)+c;
    }
    public static double kup(double a){
        return a*a*a;
    }
}
