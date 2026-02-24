package lesson22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("oleg", 1, 18, "Russia"));
        students.add(new Student("Arslan", 2, 20, "China"));
        students.add(new Student("Artem", 3, 18, "Moldova"));
        students.add(new Student("Anton", 4, 22, "Belarus"));
        students.add(new Student("oleg", 1, 18, "Russia"));
        students.add(new Student("Djangar", 3, 25, "Russia"));
        students.add(new Student("oleg", 1, 18, "Russia"));
        students.add(new Student("Arslan", 2, 20, "China"));
        System.out.println("на основе полученных данных из списка list найти сколько уникальных студентов учится в ВУЗе");

        long quantityOfStudents = students.stream()
                .distinct()
                .count();
        System.out.println("\nРеальное количество студентов в ВУЗе " + quantityOfStudents);


        System.out.println("\nНа основе полученных данных изз списка students найти всех участников , которые" +
                "учатся в России" +
                "отсортировать их по алфавиту - имени . " +
                "преобразовать их в короткую версию записи" +
                "о студенте , " +
                "ограничится только первыми двумя и" +
                " вывести в консооль");

        //анонимная функция
        // название переменной -> что с ней делать
        // двойное двоеточие - это ссылка на метод
        students.stream()
                .filter(student -> student.getCountry().equals("Russia"))
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                // .sorted(Comparator.comparing(Student::getName))    то же самое что и выше
                .map(student -> new StudentShort(student.getName(), student.getAge()))
                .limit(2)
                //.forEach(student-> System.out.println(student))  то же самое что и внизу
                .forEach(System.out::println);


        System.out.println(" найти все уникалльные имена и " +
                "собрать их в отдельлную переменную списка" +
                "вывести данный цикл в консоль с помощью метод forEach и ссылки на метод\n");

        List<String> names = students.stream()                  // переменная списка names и запускаем стрим
                .map(Student::getName)                          //  map по каждому Student получаем name
                .distinct()                                     // удаляем дубликаты
                .collect(Collectors.toList());                  // собирае элементы и преобразуем в Лист и закрываем стрим
        names.forEach(System.out::println);        //отдельно вызываем  forEach из names и выводим в консоль


        System.out.println("\n на основе полученных данных из списка List " +
                "найти всех студентов которые учатся не из России и старше 19" +
                "проверить все ли учатся на первом курсе");
        boolean isAllFirstCourse = students.stream()
                .filter(student -> !student.getCountry().equals("Russia")&& student.getAge()>19)
                .allMatch(student -> student.getCourse() == 1);
        System.out.println(isAllFirstCourse? "yes" : "no");

        System.out.println("\n на основе полученных данных из списка List" +
                "найти всех студентов которые не из China" +
                "при этом старше 10 " +
                "если такие есть то любого вывести в консоль");

        students.stream()
                .filter(student -> !student.getCountry().equals("China") && student.getAge()>10)
                .findAny()
                .ifPresent(System.out::println);

        System.out.println("\n на основе полученных данных из списка List" +
                "найти всех студентов и собрать из имена в строку через запятую");
        String row = students.stream()
                .map(Student::getName)
                .collect(joining(", "));
        System.out.println(row);


    }
}
