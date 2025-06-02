package locations;

import items.IStorable;
import items.ItemCollection;


public class LocationBuilder {
    private final String name;
    private final String description;
    private final ItemCollection items = new ItemCollection();
    private boolean locked = false;

    public LocationBuilder(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public LocationBuilder addItem(IStorable item) {
        this.items.addItem(item);
        return this;
    }

    public LocationBuilder lock() {
        this.locked = true;
        return this;
    }

    public Location build() {
        return new Location(name, description, items, locked);
    }
}
