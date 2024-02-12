package shoppingcartapp;

import javax.swing.*;
import java.awt.*;

public class CheckoutBtnPanel extends JPanel {

    private final JButton additembtn;
    private final JButton deleteitembtn;

    public CheckoutBtnPanel() {
        this.setPreferredSize(new Dimension(400, 80));
        this.setBackground(new Color(129, 202, 207));

        additembtn = new JButton("Search For A Item");
        additembtn.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(this.additembtn);

        this.add(Box.createHorizontalStrut(20));

        deleteitembtn = new JButton("Delete From Shopping Cart");
        deleteitembtn.setFont(new Font("Sans-serif", Font.PLAIN, 20));
        this.add(this.deleteitembtn);
    }

    public JButton getadditembtn() {
        return additembtn;
    }

    public JButton getdeleteitembtn() {
        return deleteitembtn;
    }
}
