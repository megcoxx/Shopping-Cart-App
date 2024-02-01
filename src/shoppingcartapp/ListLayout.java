package shoppingcartapp;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ListLayout extends JPanel{
    List list;
    public ListLayout(List l) {
        list = l;
        GridLayout Layout = new GridLayout(10, 2);
        Layout.setVgap(5);
        for(GroceryItem i : list.Items){
            JLabel row1 = new JLabel(i.name);
            JLabel row2 = new JLabel(Float.toString(i.price));
            Layout.addLayoutComponent("Row 1", row1);
            Layout.addLayoutComponent("Row 2", row2);
            setLayout(Layout);

        }
        setVisible(true);
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
