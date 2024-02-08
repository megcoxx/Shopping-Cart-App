package shoppingcartapp;

import javax.swing.*;

import java.awt.Component;
import java.util.ArrayList;

public class List extends JPanel {
    
    ArrayList<GroceryItem> Items = new ArrayList<>();

    public List() {
        Items = new ArrayList<GroceryItem>();
    }

    public boolean add(GroceryItem I){
        return Items.add(I);
     }

     void indexnum() {
        Component[] listcomp = this.getComponents();
        for (int i = 0; i < listcomp.length; i++) {
            if (listcomp[i] instanceof GroceryItem groceryItem) {
                groceryItem.writeindexjl(i + 1);
            }
        }
    }
}
