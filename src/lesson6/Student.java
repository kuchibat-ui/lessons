package lesson6;

import java.util.Objects;

public class Student {
    private final String snils;
    private String name;
    private int course;
    private int age;


    public Student(String name, int course, int age,String snils) {
        this.name = name;
        this.course = course;
        this.age = age;
        this.snils=snils;
    }

    public  void toStudy(){
        System.out.println("я учусь на "+ course+" курсе");
    }

    public void tryToMeet(){
        System.out.println("привет меня зовут "+ name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && age == student.age && Objects.equals(snils, student.snils) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snils, name, course, age);
    }

    @Override
    public String toString() {
        return " я студент курса "+course+" мне "+ age+" лет, меня зовут "+name+ " мой снилс "+snils;
    }
}
