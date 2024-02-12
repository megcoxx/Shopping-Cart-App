package shoppingcartapp;

import javax.swing.*;

import java.awt.Component;
import java.util.ArrayList;

public class List extends JPanel {

    ArrayList<GroceryItem> listItems = new ArrayList<>();

    public List() {
        listItems = new ArrayList<GroceryItem>();
    }

    public boolean addItemToList(GroceryItem I) {
        return listItems.add(I);
    }

    void calculateIndexNum() {
        Component[] componentsofList = this.getComponents();
        for (int i = 0; i < componentsofList.length; i++) {
            if (componentsofList[i] instanceof GroceryItem groceryItem) {
                groceryItem.writeIndexValue(i + 1);
            }
        }
    }
}
