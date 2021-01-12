package JavaCore_Final;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private final List<ShipCoordinates> shipCoordinates;
    private int shipLength;

    public Ship(int shipLength) {
        this.shipCoordinates = new ArrayList<>();
        this.shipLength = shipLength;
    }

    public Ship(List<ShipCoordinates> shipCoordinates, int shipLength) {
        this.shipCoordinates = shipCoordinates;
        this.shipLength = shipLength;
    }

    public List<ShipCoordinates> getShipCoordinates() { return shipCoordinates; }

    public int getShipLength() { return shipLength; }

    void addShip(ShipCoordinates ship) { this.shipCoordinates.add(ship); }

    void deleteShipCoordinates(ShipCoordinates shipCoordinates) {
        this.shipCoordinates.remove(shipCoordinates);
        this.shipLength -= 1;
    }
}
