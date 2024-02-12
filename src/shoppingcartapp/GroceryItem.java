package shoppingcartapp;

import javax.swing.*;
import java.awt.*;

import static java.lang.Boolean.TRUE;

//keep textfield for searching for item
//change to label for adding
public class GroceryItem extends JPanel {

    String name;
    float price;
    boolean onList;
    boolean shopped;
    // change to add to list

    private final JLabel pricelabel;
    private final JLabel index;
    private final JLabel itemname;
    private final JButton additembtn;
    // change to add to list
    private final JButton removeItemBtn;

    //
    public GroceryItem() {
        GridLayout itemLayout = new GridLayout(1, 4);
        itemLayout.setHgap(5);
        this.setPreferredSize(new Dimension(400, 20));
        this.setBackground(Color.pink);
        this.setLayout(itemLayout);

        index = new JLabel("");
        index.setPreferredSize(new Dimension(10, 20));
        index.setHorizontalAlignment(JLabel.LEFT);
        index.setBackground(Color.pink);
        this.add(this.index);

        pricelabel = new JLabel("");
        pricelabel.setPreferredSize(new Dimension(10, 20));
        pricelabel.setHorizontalAlignment(JLabel.LEFT);
        pricelabel.setBackground(Color.pink);
        this.add(this.pricelabel);

        itemname = new JLabel("");
        itemname.setPreferredSize(new Dimension(10, 20));
        itemname.setBorder(BorderFactory.createEmptyBorder());
        itemname.setBackground(Color.pink);
        this.add(this.itemname);

        additembtn = new JButton("Add");
        additembtn.setPreferredSize(new Dimension(10, 20));
        this.add(this.additembtn);

        removeItemBtn = new JButton("Remove");
        removeItemBtn.setPreferredSize(new Dimension(10, 20));
        this.add(this.removeItemBtn);
    }

    public GroceryItem(String Name, float Price) {
        name = Name;
        price = Price;
        GridLayout itemLayout = new GridLayout(1, 4);
        itemLayout.setHgap(5);
        this.setPreferredSize(new Dimension(400, 20));
        this.setBackground(Color.pink);
        this.setLayout(itemLayout);

        index = new JLabel("");
        index.setPreferredSize(new Dimension(10, 20));
        index.setHorizontalAlignment(JLabel.LEFT);
        index.setBackground(Color.pink);
        this.add(this.index);

        pricelabel = new JLabel(String.valueOf(price));
        pricelabel.setPreferredSize(new Dimension(10, 20));
        pricelabel.setHorizontalAlignment(JLabel.LEFT);
        pricelabel.setBackground(Color.pink);
        this.add(this.pricelabel);

        itemname = new JLabel(name);
        itemname.setPreferredSize(new Dimension(10, 20));
        itemname.setBorder(BorderFactory.createEmptyBorder());
        itemname.setBackground(Color.pink);
        this.add(this.itemname);

        additembtn = new JButton("Add");
        additembtn.setPreferredSize(new Dimension(10, 20));
        this.add(this.additembtn);

        removeItemBtn = new JButton("Remove");
        removeItemBtn.setPreferredSize(new Dimension(10, 20));
        this.add(this.removeItemBtn);
    }

    public GroceryItem(String Name) {
        name = Name;
        GridLayout itemLayout = new GridLayout(1, 4);
        itemLayout.setHgap(5);
        this.setPreferredSize(new Dimension(400, 20));
        this.setBackground(Color.pink);
        this.setLayout(itemLayout);

        index = new JLabel("");
        index.setPreferredSize(new Dimension(10, 20));
        index.setHorizontalAlignment(JLabel.LEFT);
        index.setBackground(Color.pink);
        this.add(this.index);

        pricelabel = new JLabel("");
        pricelabel.setPreferredSize(new Dimension(10, 20));
        pricelabel.setHorizontalAlignment(JLabel.LEFT);
        pricelabel.setBackground(Color.pink);
        this.add(this.pricelabel);

        itemname = new JLabel(name);
        itemname.setPreferredSize(new Dimension(10, 20));
        itemname.setBorder(BorderFactory.createEmptyBorder());
        itemname.setBackground(Color.pink);
        this.add(this.itemname);

        additembtn = new JButton("Add");
        additembtn.setPreferredSize(new Dimension(10, 20));
        this.add(this.additembtn);

        removeItemBtn = new JButton("Remove");
        removeItemBtn.setPreferredSize(new Dimension(10, 20));
        this.add(this.removeItemBtn);

    }

    public void writeIndexValue(int n) {
        this.index.setText(String.valueOf(n));
        this.revalidate();
    }

    public JButton getAddItemBtn() {
        return this.additembtn;
    }

    public JButton getRemoveBtn() {
        return this.removeItemBtn;
    }

    public void changeShoppedStatus() {
        this.itemname.setBackground(Color.green);
        this.index.setBackground(Color.green);
        // this.remove.setBackground(Color.green);
        this.additembtn.setBackground(Color.green);
        this.shopped = TRUE;
        this.setBackground(Color.green);
        revalidate();
    }

    @Override
    public String toString() {
        return this.name;
    }

}
