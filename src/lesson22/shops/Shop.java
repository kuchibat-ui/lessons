package lesson22.shops;

import java.util.Comparator;
import java.util.Objects;

public class Shop implements Comparable<Shop> {
    private String name;
    private double income;
    private double area;

    public Shop(String name,double income,double area ) {
        this.area = area;
        this.income = income;
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public double getIncome() {
        return income;
    }

    public String getName() {
        return name;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Double.compare(income, shop.income) == 0 && Double.compare(area, shop.area) == 0 && Objects.equals(name, shop.name);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "area=" + area +
                ", name='" + name + '\'' +
                ", income=" + income +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, income, area);


    }


    @Override
    public int compareTo(Shop o) {
        if (this.income != o.income) {
        return (int) (o.income-this.income );
    }
        return 0;
    }
}
