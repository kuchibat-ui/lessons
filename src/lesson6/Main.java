package lesson6;

public class Main {
    public static void main(String[] args) {
        Student student1=new Student("алина",2,20,"222-333-444 56");
        student1.toStudy();
        student1.tryToMeet();
        Student student2=new Student("эдик",1,23,"333-444-555 66");
        Student student3=new Student("алина",2,20,"222-333-444 56");
        student2.toStudy();
        student2.tryToMeet();
        student1.setAge(21);
        student1.setCourse(3);
        System.out.println();
        System.out.println("студент  по имени "+student1.getName()+" поступил в универ");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.equals(student3));
    }
}
