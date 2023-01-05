package day21statickeyword.exercise;

import day21statickeyword.Student;
import day21statickeyword.exercise.ExerciseStudent;

public class ExerciseStudentRunner {
    public static void main(String[] args) {

        //static bu sekilde cagirilir. stdName static sadece class ismini kullan yeter
        System.out.println(Student.stdName);

        //non-static bu sekilde cagirilir. age non-static ona ulasmak icin object olusturmak zorundayiz.
        Student name1=new Student();
        System.out.println(name1.age);

        String initials= ExerciseStudent.getInitials("Tom Cruise");
        System.out.println(initials);//TC

        ExerciseStudent name2=new ExerciseStudent();
        System.out.println(name2.countVowels("Hasan"));

    }
}
