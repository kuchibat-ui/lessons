package lesson22;

import java.util.Objects;

public class Student {
    private int course;
    private String country;
    private String name;
    private int age;

    public Student( String name,int course, int age, String country) {
        this.age = age;
        this.country = country;
        this.course = course;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && age == student.age && Objects.equals(country, student.country) && Objects.equals(name, student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", course=" + course +
                ", country='" + country + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, country, name, age);


    }
}
