import java.time.LocalDate;

public class CruiseShipForOcean extends CruiseShip {
    private final int COST_CONSTANT = 30000;
    private int numberOfFloors;
    private boolean hasSwimmingPools;

    public CruiseShipForOcean() {
    }

    public CruiseShipForOcean(int numberOfFloors) {
        this("'Ocean-Liner'", numberOfFloors, true);
    }

    public CruiseShipForOcean(String name, int numberOfFloors, boolean hasSwimmingPools) {
        super(name);
        this.numberOfFloors = numberOfFloors;
        this.hasSwimmingPools = hasSwimmingPools;
    }

    @Override
    public Long getCost() {
        // getCost() for CruiseShipOcean = numberOfFloors * CostConstant
        // (which e.g. has the value 3000 if hasSwimmingPools is true, otherwise it is 2500)
        if (hasSwimmingPools){
            return (long) COST_CONSTANT * numberOfFloors;
        }
        return (long) (COST_CONSTANT - 500) * numberOfFloors;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
