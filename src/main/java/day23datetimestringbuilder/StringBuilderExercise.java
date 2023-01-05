package day23datetimestringbuilder;

public class StringBuilderExercise {
    public static void main(String[] args) {

     StringBuilder sb5= new StringBuilder("Java");
     StringBuilder sb6=new StringBuilder("Java");

     int t=sb5.compareTo(sb6);
        System.out.println(t);


        sb6.setCharAt(0,'@');
        System.out.println(sb6);

        sb6.replace(0,2,"xyz");
        System.out.println(sb6);
    }
}
