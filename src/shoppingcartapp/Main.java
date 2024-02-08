
package shoppingcartapp;

import java.util.ArrayList;

public class Main {

    
    public static void main(String[] args) {

        ArrayList<Aisle> aisles = new ArrayList<>();
        Aisle Meat = new Aisle("Meat");
        Aisle Dairy = new Aisle("Dairy");
        Aisle Grocery = new Aisle("Grocery");
        List MyList = new List();
        MyList.add(new GroceryItem("something",(float) 3));
        Meat.add(new GroceryItem("Chicken", (float) 6.45));
        Meat.add(new GroceryItem("Beef", (float)4.75));
        Dairy.add(new GroceryItem("Milk", (float) 3.99));
        Grocery.add(new GroceryItem("Cereal", (float)2.95));
        aisles.add(Meat);
        aisles.add(Grocery);
        aisles.add(Dairy);

        AppFrame ShoppingList = new AppFrame(aisles, MyList);
        
    }
    
}
