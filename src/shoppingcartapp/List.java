package shoppingcartapp;

import javax.swing.*;

import java.util.ArrayList;

public class List extends JPanel {

    ArrayList<GroceryItem> listItems = new ArrayList<>();

    public List() {
        listItems = new ArrayList<GroceryItem>();
    }

    public boolean addItemToList(GroceryItem I) {
        return listItems.add(I);
    }
}
