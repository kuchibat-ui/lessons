package lesson9.homeWork9_2;

import java.util.Objects;

/**
 * здесь родительский класс описывает персонал на Электростанции
 * (поля,конструктор,методы, геттеры и сеттеры)
 * в дочерних классах описаны работники станции (операторы,инженеры,руководство итд)
 * в них переопределеныые методы, свои поля и свой метод
 */

abstract class StaffOfPowerPlant {
    private final String rank;
    private final String name;
    private int stage;
    private int salary;
    private int levelSkill;

    public StaffOfPowerPlant(String rank, int levelSkill, String name, int salary, int stage) {
        this.rank = rank;
        this.levelSkill = levelSkill;
        this.name = name;
        this.salary = salary;
        this.stage = stage;
    }

    // метод, график работы
    abstract String goingToWork();

    // метод ,расчет зарплаты
    abstract double totalSalary();

    public String getRank() {
        return rank;
    }

    public int getLevelSkill() {
        return levelSkill;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getStage() {
        return stage;
    }

    public void setLevelSkill(int levelSkill) {
        this.levelSkill = levelSkill;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StaffOfPowerPlant that = (StaffOfPowerPlant) o;
        return stage == that.stage && salary == that.salary && levelSkill == that.levelSkill && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stage, salary, levelSkill);
    }

    @Override
    public String toString() {
        return String.format("Я %s, меня зовут %s,работаю уже %d лет, %d разряда, " +
                        "моя зарплата с учетом премии %s руб, хожу на работу %s",
                rank,
                name,
                stage,
                levelSkill,
                totalSalary(),
                goingToWork());
    }
}
