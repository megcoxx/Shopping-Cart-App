package shoppingcartapp;

import java.util.ArrayList;

public class Aisle {

    ArrayList<GroceryItem> Items = new ArrayList<>();
    String Name;

    Aisle(String name){
        Name = name;
    }

    public boolean add(GroceryItem I){
       return Items.add(I);
    }
}
