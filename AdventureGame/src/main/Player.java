package main;

import items.ItemCollection;
import locations.Location;

public class Player {
    private ItemCollection inventory = new ItemCollection();
    private Location playerLocation;

    public Player(Location playerLocation) {
        this.playerLocation = playerLocation;
    }

    public ItemCollection getInventory() {
        return inventory;
    }

    public Location getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(Location playerLocation) {
        this.playerLocation = playerLocation;
    }
}
