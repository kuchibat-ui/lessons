package lesson9.homeWork9_2;

public class Managment extends StaffOfPowerPlant {

    //  bonus ставка премия
    double bonus;

    public Managment(int levelSkill, String name, int salary, int stage, double bonus) {
        super("Руководитель", levelSkill, name, salary, stage);
        this.bonus = bonus;
    }

    // собственный метод в классе
    public void ManageOfStaff() {
        System.out.println("управляю подчиненными, раздаю задания персоналу, провожу инструктаж и допуск к работе");
    }

    @Override
    public String goingToWork() {
        return "ежедневно с пн по пт";
    }

    @Override
    double totalSalary() {
        double total = getSalary() + bonus * getSalary();
        return total;
    }
}
