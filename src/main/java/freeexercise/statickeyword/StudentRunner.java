package freeexercise.statickeyword;

public class StudentRunner {
    public static void main(String[] args) {

        System.out.println(Student.stdName);
        //Bu variable static oldugu icin obje oluturmadan class ismiyle ulastik

        Student std1=new Student();
        System.out.println(std1.age);
        //Bu variable non-static oldugu icin obje olusturarak ulastik zorunlu
        System.out.println(std1.name);

        System.out.println(Student.age1);

        Student std2=new Student();
        System.out.println(std2.age);

       // System.out.println(std2.stdName);//Tavsiye edilmez rokwti adamin kafasina baglama

    }
}
