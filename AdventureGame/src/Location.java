import items.ItemCollection;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private String name;
    private String description;
    private Map<Direction, Location> adjacent = new HashMap<>();
    private ItemCollection items = new ItemCollection();
}
