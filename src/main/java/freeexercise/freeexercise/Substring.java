package freeexercise.freeexercise;

public class Substring {
    public static void main(String[] args) {
        updateWord("john", "black");
    }
    public static void updateWord(String s, String t) {
        s = s.substring(0,1).toUpperCase() + t.substring(2);
        System.out.println(s);
    }

}
