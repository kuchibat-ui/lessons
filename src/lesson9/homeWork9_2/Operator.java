package lesson9.homeWork9_2;

public class Operator extends StaffOfPowerPlant{
    //  bonus ставка премия
    double bonus;

    public Operator(int levelSkill, String name, int salary, int stage,double bonus) {
        super("Оператор",levelSkill, name, salary, stage);
        this.bonus=bonus;
    }
    // собственный метод в классе
    public void monitoringAndOperate(){
        System.out.println("смотрю за параметрами и управляю оборудованием");
    }

    @Override
    public String goingToWork() {
        return " по сменам, день-ночь";
    }

    @Override
    double totalSalary() {
        double total=getSalary()+bonus*getSalary();
        return total;
    }
}
