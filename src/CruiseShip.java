import java.time.LocalDate;

public abstract class CruiseShip extends Ship{
    private int passengers;

    public CruiseShip() {
        this(2500);
    }

    public CruiseShip(int passengers) {
        this.passengers = passengers;
    }

    public CruiseShip(String name) {
        super(name);
    }

    public CruiseShip(String name, LocalDate yearBuilt, int passengers) {
        super(name, yearBuilt);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        if (getClass().getName().equals("CruiseShipForOcean")){
            return "The cost of ship 1 with the " + getName() + " and with the type "+ getClass().getName() + " is: " + getCost();
        }
        return "The cost of ship 2 with the " + getName() + " and with the type "+ getClass().getName() + " is: " + getCost();
    }
}
