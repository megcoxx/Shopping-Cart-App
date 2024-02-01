package shoppingcartapp;

import javax.swing.*;
import java.util.ArrayList;

public class List extends JPanel {
    
    ArrayList<GroceryItem> Items = new ArrayList<>();

    public List() {
        Items = new ArrayList<GroceryItem>();
    }

    public boolean add(GroceryItem I){
        return Items.add(I);
     }
}
