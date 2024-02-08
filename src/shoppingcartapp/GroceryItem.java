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
    //change to add to list

    private final JLabel pricelabel;
    private final JLabel index;
    private final JLabel itemname;
    private final JButton additembtn;
    //change to add to list
   private final JButton remove;
//    
    public GroceryItem(){
        GridLayout Layoutitem = new GridLayout(1, 4);
        Layoutitem.setHgap(5);
        this.setPreferredSize(new Dimension(400, 20));
        this.setBackground(Color.pink);
        this.setLayout(Layoutitem);

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

       remove = new JButton("Remove");
       remove.setPreferredSize(new Dimension(10, 20));
       this.add(this.remove);

    }

    public GroceryItem(String Name, float Price) {
        name = Name;
        price = Price;
        GridLayout Layoutitem = new GridLayout(1, 4);
        Layoutitem.setHgap(5);
        this.setPreferredSize(new Dimension(400, 20));
        this.setBackground(Color.pink);
        this.setLayout(Layoutitem);

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

       remove = new JButton("Remove");
       remove.setPreferredSize(new Dimension(10, 20));
       this.add(this.remove);

    }
    
    public GroceryItem(String Name) {
        name = Name;
        GridLayout Layoutitem = new GridLayout(1, 4);
        Layoutitem.setHgap(5);
        this.setPreferredSize(new Dimension(400, 20));
        this.setBackground(Color.pink);
        this.setLayout(Layoutitem);

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

       remove = new JButton("Remove");
       remove.setPreferredSize(new Dimension(10, 20));
       this.add(this.remove);

    }

    public void writeindexjl(int n) {
        this.index.setText(String.valueOf(n));
        this.revalidate();
    }

    public JButton getshoppedj() {
        return this.additembtn;
    }

    public JButton getremovej() {
       return this.remove;
    }

    public void shoppedstatus() {
        this.itemname.setBackground(Color.green);
        this.index.setBackground(Color.green);
//        this.remove.setBackground(Color.green);
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
