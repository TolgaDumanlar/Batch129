package aajavarepeat.day03scanner;

public class Runner {
    public static void main(String[] args) {

        //object nasil olusturulur

        Car myCar=new Car();

        System.out.println(myCar.fiyat);
        System.out.println(myCar.model);
        myCar.hareket();
        myCar.dur();

        Student myStudent=new Student();
        System.out.println(myStudent.grade);
        myStudent.feed();
        myStudent.study();



    }



}
