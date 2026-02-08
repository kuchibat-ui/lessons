package lesson16;

import java.util.Comparator;

public class SortByYearComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        //сначала сортируем по году по возрастанию
        if (o1.getYear() != o2.getYear()) {
            return o1.getYear() - o2.getYear();
        }
        //затем сортируем по номиналу по возрастанию
        if (o1.getNominal()!= o2.getNominal()) {
            return o2.getNominal() - o1.getNominal();
        }
        //затем сортируем по металлу по возрастанию (От А до Я)
        if (o1.getMetalName().equals(o2.getMetalName())){
            return o1.getMetalName().compareTo(o2.getMetalName());
        }
        //затем сортируем по диаметру по возрастанию
        if (o1.getDiameter() != o2.getDiameter()) {
            return Double.compare(o1.getDiameter(),o2.getDiameter());
        }
        return 0;
    }
}
