package day22staticblockcontructors.exercise;

public class StudentExercise {

    String name;
    int age;
    int grade;
    String stdId;
    String adress;

    public StudentExercise(String name, int age, int grade, String stdId, String adress) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.stdId = stdId;
        this.adress = adress;
    }

    public StudentExercise(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "StudentExercise{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", stdId='" + stdId + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
