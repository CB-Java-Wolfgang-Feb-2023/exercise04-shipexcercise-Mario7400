import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShipDemo {
    public static void main(String[] args) {

        CargoShip cargoShip = new CargoShip("'MyCargoShip'", LocalDate.of(2022, 3,30),50);
        CruiseShipForRiver cruiseShipForRiver = new CruiseShipForRiver();
        CruiseShipForOcean cruiseShipForOcean = new CruiseShipForOcean(150);

        List<Ship> shipList = new ArrayList<>();
        shipList.add(cargoShip);
        shipList.add(cruiseShipForRiver);
        shipList.add(cruiseShipForOcean);

        System.out.println("Done with For-Loop:");
        long allCosts = ShipUtils.calculateAllCostsWithForLoop(shipList);
        System.out.println(allCosts);
        double averageCosts = ShipUtils.calculateAverageCostWithForLoop(shipList);
        System.out.println(averageCosts + "\n");

        System.out.println("Done with ForEach:");
        System.out.println(ShipUtils.calculateAllCostsWithForEach(shipList));
        System.out.println(ShipUtils.calculateAverageCostWithForEach(shipList) + "\n");

        System.out.println("Done with Iterator:");
        System.out.println(ShipUtils.calculateAllCostsWithIterator(shipList));
        System.out.println(ShipUtils.calculateAverageCostWithIterator(shipList) + "\n");

        System.out.println(cruiseShipForOcean);
        System.out.println(cruiseShipForRiver);
        System.out.println(cargoShip  + "\n");

        System.out.println("The sum of all costs: " + allCosts);
        System.out.println("The average costs of all the ships: " + averageCosts);
    }
}

class ShipUtils {
    private List<Ship> shipList;

    public ShipUtils() {
    }

    public ShipUtils(List<Ship> shipList) {
        this.shipList = shipList;
    }

    public static long calculateAllCostsWithForLoop(List<Ship> ship){
        long sumOfCosts = 0;
        for (int i = 0; i < ship.size(); i++) {
            sumOfCosts += ship.get(i).getCost();
        }
        return sumOfCosts;
    }

    public static double calculateAverageCostWithForLoop(List<Ship> ship){
        long averageOfCosts = 0;
        for (int i = 0; i < ship.size(); i++) {
            averageOfCosts += ship.get(i).getCost();
        }
        return (double) averageOfCosts / (ship.size());
    }

    public static long calculateAllCostsWithForEach(List<Ship> ship){
        long sumOfCosts = 0;
        for (Ship ship1 : ship) {
            sumOfCosts += ship1.getCost();
        }
        return sumOfCosts;
    }

    public static double calculateAverageCostWithForEach(List<Ship> ship){
        long averageOfCosts = 0;
        for (Ship ship1 : ship) {
            averageOfCosts += ship1.getCost();
        }
        return (double) averageOfCosts / (ship.size());
    }

    public static long calculateAllCostsWithIterator(List<Ship> ship){
        long sumOfCosts = 0;
        Iterator<Ship> itr = ship.iterator();
        Ship currentShip;
        while (itr.hasNext()){
            currentShip = itr.next();
            sumOfCosts += currentShip.getCost();
        }
        return sumOfCosts;
    }

    public static double calculateAverageCostWithIterator(List<Ship> ship){
        long averageOfCosts = 0;
        Iterator<Ship> itr = ship.iterator();
        Ship currentShip;
        while (itr.hasNext()){
            currentShip = itr.next();
            averageOfCosts += currentShip.getCost();
        }
        return (double) averageOfCosts / (ship.size());
    }


    @Override
    public String toString() {
        return "ShipUtils{" +
                "shipList=" + shipList +
                '}';
    }
}

