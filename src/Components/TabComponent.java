package Components;

import Shop.Product;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class TabComponent extends JPanel implements ActionListener {
    public TabComponent(ArrayList<Product> products) {
        this.setPreferredSize(new Dimension(400, 400));

        createCombobox(products);
    }

    public void createCombobox(ArrayList<Product> products) {
        JComboBox<Product> comboBox = new JComboBox<>();

        add(comboBox);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
