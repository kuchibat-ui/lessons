package practic20.function;

import java.util.Objects;

public class ShortCoin {
    private int nominal;
    private String metalName;

    public ShortCoin(int nominal,String metalName ) {
        this.metalName = metalName;
        this.nominal = nominal;
    }

    public String getMetalName() {
        return metalName;
    }

    public int getNominal() {
        return nominal;
    }

    public void setMetalName(String metalName) {
        this.metalName = metalName;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShortCoin shortCoin = (ShortCoin) o;
        return nominal == shortCoin.nominal && Objects.equals(metalName, shortCoin.metalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nominal, metalName);
    }

    @Override
    public String toString() {
        return "ShortCoin{" +
                "metalName='" + metalName + '\'' +
                ", nominal=" + nominal +
                '}';
    }
}
