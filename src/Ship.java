import java.time.LocalDate;

public abstract class Ship {

    private String name;
    private LocalDate yearBuilt;

    public Ship() {
    }

    public Ship(String name) {
        this.name = name;
    }

    public Ship(String name, LocalDate yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public abstract Long getCost();


    public String getName() {
        return name;
    }

    public LocalDate getYearBuilt() {
        return yearBuilt;
    }


    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", yearBuilt=" + yearBuilt +
                '}';
    }
}
