import java.time.LocalDate;

public class CargoShip extends Ship{

    private final int COST_CONSTANT = 20000;
    private int tonnage; // => Tagesförderleistung

    public CargoShip() {
        this(50);
    }

    public CargoShip(int tonnage) {
        this.tonnage = tonnage;
    }

    public CargoShip(String name, LocalDate localDate, int tonnage) {
        super(name, localDate);
        this.tonnage = tonnage;
    }

    @Override
    public Long getCost() {
        //getCost() for CargoShip = tonnage * CostConstant (which e.g. has the value 20)
        return (long) tonnage * COST_CONSTANT;
    }

    @Override
    public String toString() {
        return "The cost of ship 3 with the " + getName() + " and with the type " + getClass().getName() +" is: " + getCost();
    }
}
