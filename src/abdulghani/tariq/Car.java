package abdulghani.tariq;

public class Car {
    private String made;
    private int capacityCm3;
    private int year;

    public Car() {
    }

    public Car(String made, int capacityCm3, int year) {
        this.made = made;
        this.capacityCm3 = capacityCm3;
        this.year = year;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public int getCapacityCm3() {
        return capacityCm3;
    }

    public void setCapacityCm3(int capacityCm3) {
        this.capacityCm3 = capacityCm3;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%s-%d-%d", made, capacityCm3, year);
    }
}
