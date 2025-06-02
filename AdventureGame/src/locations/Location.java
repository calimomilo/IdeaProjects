package locations;

import items.ItemCollection;
import utils.Direction;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final String name;
    private final String description;
    private final Map<Direction, Location> adjacent = new HashMap<>();
    private ItemCollection items = new ItemCollection();
    private boolean locked = false;

    protected Location(String name, String description, ItemCollection items, boolean locked) {
        this.name = name;
        this.description = description;
        this.items = items;
        this.locked = locked;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Map<Direction, Location> getAdjacent() {
        return adjacent;
    }

    public Location getAdjacent(Direction direction) {
        return adjacent.get(direction);
    }

    public ItemCollection getItems() {
        return items;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
