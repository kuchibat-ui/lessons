package lesson9.homeWork9_2;

public class Main {
    public static void main(String[] args) {
        Operator operator1 = new Operator(4, "Вася", 60000, 2, 1.1);
        operator1.goingToWork();
        operator1.totalSalary();
        System.out.println(operator1);
        System.out.println("-----------------------------------------------------------");

        Electrical engeneer = new Electrical(5, "Петя", 70000, 4, 1.15);
        Managment boss = new Managment(5, "Саня", 100000, 5, 1.2);
        Technical engeneer2 = new Technical(5, "Коля", 70000, 5, 1.15);
        Accountant economist = new Accountant(2, "Катя", 55000, 6, 1.1);

        StaffOfPowerPlant[] staffArray = {operator1, engeneer, engeneer2, boss, economist};
        for (StaffOfPowerPlant staffOfPowerPlant : staffArray) {
            System.out.println(staffOfPowerPlant);
            if (staffOfPowerPlant instanceof Operator) {
                Operator operatorFromArray = (Operator) staffOfPowerPlant;
                operatorFromArray.monitoringAndOperate();
            }
            if (staffOfPowerPlant instanceof Accountant) {
                Accountant accountantFromArray = (Accountant) staffOfPowerPlant;
                accountantFromArray.calculateSalary();
            }
            if (staffOfPowerPlant instanceof Electrical) {
                Electrical electricalFromArray = (Electrical) staffOfPowerPlant;
                electricalFromArray.MaintenanceAndRepair();
            }
            if (staffOfPowerPlant instanceof Managment) {
                Managment managmentFromArray = (Managment) staffOfPowerPlant;
                managmentFromArray.ManageOfStaff();
            }
            if (staffOfPowerPlant instanceof Technical) {
                Technical technicalFromArray = (Technical) staffOfPowerPlant;
                technicalFromArray.repair();
            }
        }
    }
}
