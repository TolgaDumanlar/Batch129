package smallstudygroup.stringmanipulation;

public class C07_stringManupulation {
    public static void main(String[] args) {
        /*
        girilen Stringedeki tum rakamlari * ile degistiriniz
         */

        String str="bu4ak1654";
        str=str.replaceAll("[0-9]","*");
        System.out.println(str);

    }
}
