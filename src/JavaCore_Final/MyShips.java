package JavaCore_Final;

import java.util.ArrayList;
import java.util.List;

public class MyShips {
    private final List<Ship> shipList;
    int countShips = 10;

    public MyShips() {
        this.shipList = new ArrayList<>();
    }

    public List<Ship> getShipList() { return shipList; }

    public int getCountShips() { return countShips; }

    void addShip(Ship ship) { this.shipList.add(ship); }

    void deleteShip(Ship ship) {
        this.shipList.remove(ship);
        this.countShips -=1;
    }
}
