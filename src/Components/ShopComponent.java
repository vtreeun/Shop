package Components;

import Shop.Product;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ShopComponent extends JFrame {

    public ShopComponent(Product[] products) {
        this.setTitle("Shop");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        createTabComponents(products);
    }

    public void createTabComponents(Product[] products) {
        JTabbedPane tabbedPane = new JTabbedPane();

        HashMap<String, ArrayList<Product>> productsByCategory = new HashMap<>();
        for(Product product : products) {
            String category = product.getClass().getSimpleName();
            ArrayList<Product> productCategory = productsByCategory.getOrDefault(
                    category,
                    new ArrayList<>()
            );
            productCategory.add(product);
            productsByCategory.put(
                    category,
                    productCategory
            );
        }

        for (String category : productsByCategory.keySet()) {
            tabbedPane.addTab(category, new TabComponent(productsByCategory.get(category)));
        }

        getContentPane().add(tabbedPane, BorderLayout.CENTER);
    }
}
