package main;

import locations.Location;
import locations.LocationBuilder;
import utils.Direction;

public class Main {
    public static void main(String[] args) {

        Location l1 = new LocationBuilder("Kitchen", "A warm homey kitchen").lock().build();
        Location l2 = new LocationBuilder("Living Room", "A cozy lively living room").connect(Direction.NORTH, Direction.SOUTH, l1).build();
        Location l3 = new LocationBuilder("Pantry", "A small pantry stocked full").connect(Direction.WEST, Direction.EAST, l1).connect(Direction.SOUTH, Direction.EAST, l2).build();

        System.out.println(l1.getAdjacent());
        System.out.println(l2.getAdjacent());
        System.out.println(l3.getAdjacent());
    }
}