package shoppingcartapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class AppFrame extends JFrame {
    private final JButton additem;
    private final JButton deleteitem;
    TitleBar title = new TitleBar();
    BtnPanel btnpanel = new BtnPanel();
    JTabbedPane tabs = new JTabbedPane();
  

    // create hard coded data first
    // (pull out of appframe.java and send to main)
    // create functions that will take in that data and create a display for i
    // get rid of checkout and fix aisles
    // pull out static and pass in as paramater
    public AppFrame(ArrayList<Aisle> aisles, List MyList) {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(this.title, BorderLayout.NORTH);
        for (Aisle aisle : aisles) {
            tabs.addTab(aisle.Name, new AisleLayout(aisle));
        }
        // this.add(this.btnpanel, BorderLayout.SOUTH);

        // do this in main
        

        // aisle2.add(Meat, BorderLayout.CENTER);
        // aisle2.add(this.btnpanel, BorderLayout.SOUTH);
        // aisle3.add(Dairy, BorderLayout.CENTER);
        // aisle3.add(this.btnpanel, BorderLayout.SOUTH);
        // aisle4.add(Grocery, BorderLayout.CENTER);
        // aisle4.add(this.btnpanel, BorderLayout.SOUTH);

        tabs.addTab("Checkout", new ListLayout(MyList));

        this.add(this.tabs, BorderLayout.CENTER);

        additem = btnpanel.getadditembtn();
        deleteitem = btnpanel.getdeleteitembtn();

        addlistener();

    }

    // public static void addFromViewAll(String inputItem) {
    //     GroceryItem searchedItem = new GroceryItem(inputItem);
    //     boolean found = false;
    //     boolean questioned = false;

    //     // initialize lists with the aisles
    //     while (!found && !searchedItem.onList && !questioned) {
    //         if (Meat.Items.contains(new GroceryItem(searchedItem.name))) {
    //             found = true;
    //             searchedItem.onList = true;
    //             MyList.add(new GroceryItem(searchedItem.name));
    //         } else if (Dairy.Items.contains(new GroceryItem(searchedItem.name))) {
    //             found = true;
    //             searchedItem.onList = true;
    //             MyList.add(new GroceryItem(searchedItem.name));
    //         } else if (Grocery.Items.contains(new GroceryItem(searchedItem.name))) {
    //             found = true;
    //             searchedItem.onList = true;
    //             MyList.add(new GroceryItem(searchedItem.name));
    //         } else {
    //             System.out.println("The item was not found. Would you still like to add it to your list?");
    //             System.out.println("Y = Yes N = No");
    //             // Input.reset();
    //             // create yes or no dialog box
    //             // String input = Input.next();
    //             // if (Objects.equals(input, "Y") || Objects.equals(input, "y")) {
    //             // searchedItem.onList = true;
    //             // MyList.add(new GroceryItem(searchedItem.name));
    //             // } else {
    //             // questioned = true;
    //             // break;
    //             // }
    //         }

    //     }
    // }

    public void addlistener() {

        // change to search
        // additem.addMouseListener(new MouseAdapter() {
        //     @Override
        //     public void mousePressed(MouseEvent e) {
        //         GroceryItem item = new GroceryItem();
        //         MyList.add(item);
        //         MyList.indexnum();
        //         revalidate();
        //         repaint();

        //         JButton shoppedbtn = item.getshoppedj();
        //         shoppedbtn.addMouseListener(new MouseAdapter() {
        //             @Override
        //             public void mousePressed(MouseEvent e) {
        //                 item.shoppedstatus();
        //                 MyList.add(item);
        //                 revalidate();
        //             }
        //         });

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
        //     @Override
        //     public void mousePressed(MouseEvent e) {
        //         Component[] itemlist = MyList.getComponents();
        //         for (Component component : itemlist) {
        //             if (component instanceof GroceryItem) {
        //                 MyList.remove(component);
        //             }
        //         }
        //         revalidate();
        //         repaint();
        //     }
        // });
    }
}
