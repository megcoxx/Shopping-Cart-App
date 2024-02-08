package shoppingcartapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class AppFrame extends JFrame {
    JButton additem;
    JButton deleteitem;
    TitleBar title = new TitleBar();
    BtnPanel btnpanel = new BtnPanel();
    JTabbedPane tabs = new JTabbedPane();

    // create hard coded data first
    // (pull out of appframe.java and send to main)
    // create functions that will take in that data and create a display for i
    // get rid of checkout and fix aisles
    public AppFrame(ArrayList<Aisle> aisles, List MyList) {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(this.title, BorderLayout.NORTH);
        for (Aisle aisle : aisles) {
            tabs.addTab(aisle.Name, returnAisleTab(aisle));
        }

        tabs.addTab("Checkout", returnListTab(MyList));

        this.add(this.tabs, BorderLayout.CENTER);

        addlistener();

    }

    // public static void addFromViewAll(String inputItem) {
    // GroceryItem searchedItem = new GroceryItem(inputItem);
    // boolean found = false;
    // boolean questioned = false;

    // // initialize lists with the aisles
    // while (!found && !searchedItem.onList && !questioned) {
    // if (Meat.Items.contains(new GroceryItem(searchedItem.name))) {
    // found = true;
    // searchedItem.onList = true;
    // MyList.add(new GroceryItem(searchedItem.name));
    // } else if (Dairy.Items.contains(new GroceryItem(searchedItem.name))) {
    // found = true;
    // searchedItem.onList = true;
    // MyList.add(new GroceryItem(searchedItem.name));
    // } else if (Grocery.Items.contains(new GroceryItem(searchedItem.name))) {
    // found = true;
    // searchedItem.onList = true;
    // MyList.add(new GroceryItem(searchedItem.name));
    // } else {
    // System.out.println("The item was not found. Would you still like to add it to
    // your list?");
    // System.out.println("Y = Yes N = No");
    // // Input.reset();
    // // create yes or no dialog box
    // // String input = Input.next();
    // // if (Objects.equals(input, "Y") || Objects.equals(input, "y")) {
    // // searchedItem.onList = true;
    // // MyList.add(new GroceryItem(searchedItem.name));
    // // } else {
    // // questioned = true;
    // // break;
    // // }
    // }

    // }
    // }

    public void addlistener() {

        // change to search
        // additem.addMouseListener(new MouseAdapter() {
        // @Override
        // public void mousePressed(MouseEvent e) {
        // GroceryItem item = new GroceryItem();
        // MyList.add(item);
        // MyList.indexnum();
        // revalidate();
        // repaint();

        // JButton shoppedbtn = item.getshoppedj();
        // shoppedbtn.addMouseListener(new MouseAdapter() {
        // @Override
        // public void mousePressed(MouseEvent e) {
        // item.shoppedstatus();
        // MyList.add(item);
        // revalidate();
        // }
        // });

        // JButton remove = item.getremovej();
        // remove.addMouseListener(new MouseAdapter() {
        // @Override
        // public void mousePressed(MouseEvent e) {
        // MyList.remove(item);
        // MyList.indexnum();
        // revalidate();
        // repaint();
        // }
        // });
        // }
        // });

        // deleteitem.addMouseListener(new MouseAdapter() {
        // @Override
        // public void mousePressed(MouseEvent e) {
        // Component[] itemlist = MyList.getComponents();
        // for (Component component : itemlist) {
        // if (component instanceof GroceryItem) {
        // MyList.remove(component);
        // }
        // }
        // revalidate();
        // repaint();
        // }
        // });
    }

    public JPanel returnAisleTab(Aisle aisle) {
        GridLayout layout = new GridLayout(aisle.Items.size(), 2);
        JPanel panel = new JPanel();
        panel.setLayout(layout);
        for (GroceryItem i : aisle.Items) {
            JLabel row1 = new JLabel(i.name);
            JLabel row2 = new JLabel(Float.toString(i.price));
            panel.add(row1);
            panel.add(row2);
            setVisible(true);
        }
        return panel;
    }

    public JPanel returnListTab(List aisle) {
        BorderLayout blayout = new BorderLayout();
        JPanel bigPanel = new JPanel();
        bigPanel.setLayout(blayout);
        GridLayout layout = new GridLayout(aisle.Items.size(), 2);
        JPanel panel = new JPanel();
        panel.setLayout(layout);
        bigPanel.add(panel, BorderLayout.CENTER);
        for (GroceryItem i : aisle.Items) {
            JLabel row1 = new JLabel(i.name);
            JLabel row2 = new JLabel(Float.toString(i.price));
            panel.add(row1);
            panel.add(row2);
            setVisible(true);
        }
        additem = btnpanel.getadditembtn();
        deleteitem = btnpanel.getdeleteitembtn();
        bigPanel.add(btnpanel, BorderLayout.SOUTH);

        return bigPanel;
    }
}