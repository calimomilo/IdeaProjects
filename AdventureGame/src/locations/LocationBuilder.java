package locations;

import items.IStorable;
import items.ItemCollection;
import utils.Direction;

import java.util.ArrayList;
import java.util.HashMap;


public class LocationBuilder {
    private final String name;
    private final String description;
    private final HashMap<Direction, Location> adjacent = new HashMap<>();
    private final ArrayList<Location> connectedLocations = new ArrayList<>();
    private final ArrayList<Direction> connectedLocationDirections = new ArrayList<>();
    private final ItemCollection items = new ItemCollection();
    private boolean locked = false;

    /**
     * Creates a location base with the specified name and description
     * @param name the name of the location
     * @param description the description of the location
     */
    public LocationBuilder(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Connects the location being built (A) with another existing Location (B)
     * @param out the direction to travel from this location to the other (A to B)
     * @param in the direction to travel from the other location to this one (B to A)
     * @param loc the other location (B)
     * @return the instance of the location being built
     */
    public LocationBuilder connect(Direction out, Direction in, Location loc) {
        if (adjacent.containsKey(out)) {
            throw new IllegalArgumentException(this.name + " already connected through direction " + out);
        } else {
            this.adjacent.put(out, loc);
            // stores the mirror connection to add it during build
            this.connectedLocations.add(loc);
            this.connectedLocationDirections.add(in);
            return this;
        }
    }

    /**
     * Adds the specified item to the location being built
     * @param item the item to add
     * @return the instance of the location being built
     */
    public LocationBuilder addItem(IStorable item) {
        this.items.addItem(item);
        return this;
    }

    /**
     * Locks the location being built
     * @return the instance of the location being built
     */
    public LocationBuilder lock() {
        this.locked = true;
        return this;
    }

    /**
     * Builds the location with all specified elements
     * @return the Location object
     */
    public Location build() {
        Location newLoc = new Location(name, description, adjacent, items, locked);
        // adds all mirror connections created
        for (int i = 0; i < connectedLocations.size(); i++) {
            if (connectedLocations.get(i).getAdjacent().containsKey(connectedLocationDirections.get(i))) {
                throw new IllegalArgumentException(connectedLocations.get(i).getName() + " already connected through direction " + connectedLocationDirections.get(i));
            } else {
                connectedLocations.get(i).getAdjacent().put(connectedLocationDirections.get(i), newLoc);
            }
        }
        return newLoc;
    }
}
