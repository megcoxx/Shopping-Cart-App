package shoppingcartapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class AppFrame extends JFrame {
    JButton additemBtn;
    JButton deleteitemBtn;
    TitleBar title = new TitleBar();
    CheckoutBtnPanel btnpanel = new CheckoutBtnPanel();
    JTabbedPane tabs = new JTabbedPane();

    // (pull out of appframe.java and send to main)
    // create functions that will take in that data and create a display for i
    // get rid of checkout and fix aisles
    public AppFrame(ArrayList<Aisle> aisles, List MyList) {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(this.title, BorderLayout.NORTH);
        for (Aisle aisle : aisles) {
            tabs.addTab(aisle.Name, returnAisleTab(aisle, MyList));
        }

        JPanel CheckoutTab = returnListTab(MyList);

        tabs.addTab("Checkout", CheckoutTab);

        this.add(this.tabs, BorderLayout.CENTER);

        addlistener(MyList);

    }

    /*
     * public static void addFromViewAll(String inputItem) {
     * GroceryItem searchedItem = new GroceryItem(inputItem);
     * boolean found = false;
     * boolean questioned = false;
     * 
     * // initialize lists with the aisles
     * while (!found && !searchedItem.onList && !questioned) {
     * if (Meat.Items.contains(new GroceryItem(searchedItem.name))) {
     * found = true;
     * searchedItem.onList = true;
     * MyList.add(new GroceryItem(searchedItem.name));
     * } else if (Dairy.Items.contains(new GroceryItem(searchedItem.name))) {
     * found = true;
     * searchedItem.onList = true;
     * MyList.add(new GroceryItem(searchedItem.name));
     * } else if (Grocery.Items.contains(new GroceryItem(searchedItem.name))) {
     * found = true;
     * searchedItem.onList = true;
     * MyList.add(new GroceryItem(searchedItem.name));
     * } else {
     * System.out.
     * println("The item was not found. Would you still like to add it to your list?"
     * );
     * System.out.println("Y = Yes N = No");
     * Input.reset();
     * // create yes or no dialog box
     * String input = Input.next();
     * if (Objects.equals(input, "Y") || Objects.equals(input, "y")) {
     * searchedItem.onList = true;
     * MyList.add(new GroceryItem(searchedItem.name));
     * } else {
     * questioned = true;
     * break;
     * }
     * }
     * 
     * }
     * }
     */

    public void addlistener(List MyList) {

        // change to search
        additemBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                GroceryItem item = new GroceryItem();
                MyList.addItemToList(item);
                revalidate();
                repaint();

                JButton shoppedbtn = item.getAddItemBtn();
                shoppedbtn.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        item.changeShoppedStatus();
                        MyList.addItemToList(item);
                        revalidate();
                    }
                });

                JButton remove = item.getRemoveBtn();
                remove.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        MyList.remove(item);
                        revalidate();
                        repaint();
                    }
                });
            }
        });

        deleteitemBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Component[] itemlist = MyList.getComponents();
                for (Component component : itemlist) {
                    if (component instanceof GroceryItem) {
                        MyList.remove(component);
                    }
                }
                revalidate();
                repaint();
            }
        });
    }

    public JPanel returnAisleTab(Aisle aisle, List MyList) {
        GridLayout itemLayout = new GridLayout(aisle.AisleItems.size(), 3);
        JPanel panel = new JPanel();
        panel.setLayout(itemLayout);
        for (GroceryItem i : aisle.AisleItems) {
            JLabel nameColumn = new JLabel(i.name);
            JLabel priceColumn = new JLabel(Float.toString(i.price));
            JButton addToCartBtn = new JButton("Add to Cart");
            panel.add(nameColumn);
            panel.add(priceColumn);
            panel.add(addToCartBtn);
            addToCartBtn.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    MyList.addItemToList(i);
                    MyList.revalidate();
                    MyList.repaint();
                }
            });
            setVisible(true);
        }
        return panel;
    }

    public JPanel returnListTab(List aisle) {
        JPanel fullPanel = new JPanel();
        fullPanel.setLayout(new BorderLayout());
        GridLayout itemLayout = new GridLayout(aisle.listItems.size(), 2);
        JPanel itemPanel = new JPanel();
        itemPanel.setLayout(itemLayout);
        fullPanel.add(itemPanel, BorderLayout.CENTER);
        for (GroceryItem i : aisle.listItems) {
            JLabel nameColumn = new JLabel(i.name);
            JLabel priceColumn = new JLabel(Float.toString(i.price));
            itemPanel.add(nameColumn);
            itemPanel.add(priceColumn);
            setVisible(true);
        }
        additemBtn = btnpanel.getadditembtn();
        deleteitemBtn = btnpanel.getdeleteitembtn();
        fullPanel.add(btnpanel, BorderLayout.SOUTH);

        return fullPanel;
    }
}