package freeexercise.excaptionsinterface;

public class Excaptions02 {
    public static void main(String[] args) {

        int a = 12;

        int b = 4;

        int c[] = {3, 6, 9, 12};

        m(c,a,b);



    }
    public static void m(int[] c, int a, int b) {

        try {
            int idx = a / b;
            int elemenet = c[idx];
            System.out.println(elemenet);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


}
