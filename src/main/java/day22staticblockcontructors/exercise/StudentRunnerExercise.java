package day22staticblockcontructors.exercise;

import day22staticblockcontructors.exercise.StudentExercise;

public class StudentRunnerExercise {
    public static void main(String[] args) {

        StudentExercise s1=new StudentExercise("Leyla Mina",6,1,"LM2022B3","Balikesir");
        StudentExercise s2=new StudentExercise("Hasan",14,"Izmir");

        System.out.println(s1);
        System.out.println(s2);
    }
}
