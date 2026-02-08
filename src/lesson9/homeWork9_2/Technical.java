package lesson9.homeWork9_2;

public class Technical extends StaffOfPowerPlant {

    //  bonus ставка премия
    double bonus;

    public Technical(int levelSkill, String name, int salary, int stage, double bonus) {
        super("Техник", levelSkill, name, salary, stage);
        this.bonus = bonus;
    }

    // собственный метод в классе
    public void repair() {
        System.out.println("делаю ремонт в случае аварии ");
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
