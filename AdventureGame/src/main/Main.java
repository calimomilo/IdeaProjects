package main;

import locations.Location;
import locations.LocationBuilder;

public class Main {
    public static void main(String[] args) {

        Location l1 = new LocationBuilder("Kitchen", "A warm homey kitchen").lock().build();
    }
}