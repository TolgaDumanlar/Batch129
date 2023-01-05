package day21statickeyword.exercise;

public class ExerciseStudent {

    public static String stdName = "Tom Hanks";  //static

    public int age = 13; //non-static


    //Ogrenci isminin ilk harflerini veren metodu olusturunuz
    public static String getInitials(String name) {

        String first = name.substring(0, 1);
        String second = name.split(" ")[1].substring(0, 1);
        return first + second;
    }

    //Ogrenci ismindeki sesli harfleri sayan bir metod olusturunuz

    int counter = 0;

    public int countVowels(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch=name.toLowerCase().charAt(i);
            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                break;
            }
        }
        return counter;
    }
}

