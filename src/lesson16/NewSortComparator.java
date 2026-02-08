package lesson16;

import java.util.Comparator;

public class NewSortComparator implements Comparator<Coin> {
    @Override
    public int compare(Coin o1, Coin o2) {
        //сравниваем две монеты по диаметру от большего к меньшему
        if (o1.getDiameter() != o2.getDiameter()){
            return Double.compare(o2.getDiameter(),o1.getDiameter());
        }

        //сравниваем две монеты по году от меньшего к большему
        if (o1.getYear() != o2.getYear()){
            return o2.getYear()-o1.getYear();
        }

        //сравниваем две монеты по металлу от А до Я от А до Z
          if (!o1.getMetalName().equals(o2.getMetalName())){
              return o1.getMetalName().compareTo(o2.getMetalName());
          }

          //сравниваем две монеты по номиналу от меньшего к большему
        if (o1.getNominal() != o2.getNominal()){
            return o1.getNominal()-o2.getNominal();
        }
        return 0;
    }
}
