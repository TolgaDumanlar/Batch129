package aajavarepeat.day02datetypesmethodcreation;

public class MethodCreation02 {
    public static void main(String[] args) {
     int s1=dikdortgenAlan(2,5);
        System.out.println(s1);

     int s2=dikdortgenCevre(2,3);
        System.out.println(s2);

     double s3=daireCevre(1.3);
        System.out.println(s3);
    double  s4=daireAlan(2.3);
        System.out.println(s4);
    }
    public static int dikdortgenAlan(int a, int b){
        return (a*b);
    }
    public static int dikdortgenCevre(int a, int b){
        return 2*(a+b);
    }
    public static double daireCevre(double r){
        return 2 * (Math.PI + r);
    }
    public static double daireAlan(double r){
        return Math.PI*r*r;
    }

}
