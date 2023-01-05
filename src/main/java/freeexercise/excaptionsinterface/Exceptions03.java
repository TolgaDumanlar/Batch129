package freeexercise.excaptionsinterface;

public class Exceptions03 {
    public static void main(String[] args) {
         getStudentGrade(87);
         getNumberOfStudent(-7);
    }

        public static void getStudentGrade(int grade){

        if(grade<0||grade>100){
            try {
                throw new InvalidStudentGradeException("Student Grades cannt be less than 0 or greater then 100");
            } catch (InvalidStudentGradeException e) {
                System.out.println(e.getMessage());
            }

        }else{
            System.out.println(grade);
        }
    }
         public static void getNumberOfStudent(int numOfStudent){

        if(numOfStudent<0){
            try {
                throw new InvalidNumberException("Student number cannt be negative");
            }catch(InvalidNumberException e){
                System.err.println(e.getMessage());
            }
            }else {
            System.out.println(numOfStudent);
        }
     }
}
