package day02datatypesmethodcreation;

public class Exercise {
    public static void main(String[] args) {

        int sum=add(3,5);
        System.out.println(sum);

        int carpma= (int) multiply(33,56);
        System.out.println(carpma);

        int sonuc=islem(13,12,32);

        System.out.println(sonuc);

        double sonuc1=kup(3.5);

        System.out.println(sonuc1);


    }//main

    public static int add(int a, int b){
        return a+b;
    }

    protected static long multiply (long a, long b){
        return a*b;
    }

    public static int islem(int a, int b, int c){
     return a*b+c;
    }

    static  double kup(double a){
        return a*a*a;
    }
}
