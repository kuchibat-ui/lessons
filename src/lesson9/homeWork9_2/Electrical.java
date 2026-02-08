package lesson9.homeWork9_2;

public class Electrical extends StaffOfPowerPlant {

    //  bonus ставка премия
    double bonus;

    public Electrical(int levelSkill, String name, int salary, int stage, double bonus) {
        super("Инженер Электрик", levelSkill, name, salary, stage);
        this.bonus = bonus;
    }
    // собственный метод в классе
    public void MaintenanceAndRepair() {
        System.out.println(" осматриваю оборудование и устраняю аварии");
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
