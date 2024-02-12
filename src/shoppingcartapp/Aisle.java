package shoppingcartapp;

import java.util.ArrayList;

public class Aisle {

    ArrayList<GroceryItem> AisleItems = new ArrayList<>();
    String Name;

    Aisle(String name) {
        Name = name;
    }

    public boolean addItemToAisle(GroceryItem I) {
        return AisleItems.add(I);
    }
}
