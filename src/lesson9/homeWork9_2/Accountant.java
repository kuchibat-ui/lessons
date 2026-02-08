package lesson9.homeWork9_2;

public class Accountant extends StaffOfPowerPlant {

    //  bonus ставка премия
    double bonus;

    public Accountant(int levelSkill, String name, int salary, int stage, double bonus) {
        super("Бухгалтер", levelSkill, name, salary, stage);
        this.bonus = bonus;
    }
    // собственный метод в классе
    public void calculateSalary() {
        System.out.println("веду ведомость и расчет зарплаты");
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
