import java.time.LocalDate;

public class CruiseShipForRiver extends CruiseShip {
    private final double COST_CONSTANT = 25000.5;
    private int lengthOfRiverInKm;

    public CruiseShipForRiver() {
        this("'River-Liner'", 100);
    }

    public CruiseShipForRiver(String name, int lengthOfRiverInKm) {
        super(name);
        this.lengthOfRiverInKm = lengthOfRiverInKm;
    }

    @Override
    public Long getCost() {
        // getCost() for CruiseShipRiver = lengthOfRiverInKm * CostConstant (which e.g. has the value 3)
        return lengthOfRiverInKm * (long) COST_CONSTANT;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
