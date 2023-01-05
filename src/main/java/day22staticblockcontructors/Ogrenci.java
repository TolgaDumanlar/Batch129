package day22staticblockcontructors;

public class Ogrenci {

    String name;
    int age;
    int grade;
    String stdId;
    String address;

    public Ogrenci(String name, int age, int grade, String stdId, String address) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.stdId = stdId;
        this.address = address;
    }

    public Ogrenci(String name, int age, String stdId) {
        this.name = name;
        this.age = age;
        this.stdId = stdId;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", stdId='" + stdId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
