package shoppingcartapp;

import javax.swing.*;
import java.awt.*;

public class AisleLayout extends JPanel {
//hello this is atest
    Aisle aisle;
    public JPanel AisleLayout(Aisle a) {
        aisle = a;
        GridLayout layout = new GridLayout(10, 1);
        layout.setVgap(5);
        JPanel panel = new JPanel(layout);
        for(GroceryItem i : aisle.Items){
            JLabel row1 = new JLabel(i.name);
            JLabel row2 = new JLabel(Float.toString(i.price));
            panel.add(row1);
            panel.add(row2);
            setVisible(true);
        }

        return panel;
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
