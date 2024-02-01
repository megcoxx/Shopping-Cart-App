package shoppingcartapp;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BtnPanel extends JPanel {

    Border emptyborder = BorderFactory.createEmptyBorder();
    private final JButton additem;
    private final JButton deleteitem;

    public BtnPanel() {
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(new Color(129, 202, 207));

        additem = new JButton("Add This Item");
        additem.setBorder(emptyborder);
        additem.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(this.additem);

        this.add(Box.createHorizontalStrut(20));

        deleteitem = new JButton("Delete From Shopping Cart");
        deleteitem.setBorder(emptyborder);
        deleteitem.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(this.deleteitem);
    }

    public JButton getadditembtn() {
        return additem;
    }

    public JButton getdeleteitembtn() {
        return deleteitem;
    }
}
