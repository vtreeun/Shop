import Components.ShopComponent;
import Shop.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Shop {
    public static void main(String[] args) throws ParseException {
        Product[] products = {
                new HomeAppliance(0, 5400.0F, "Samsung", new SimpleDateFormat("dd/MM/yyyy").parse("16/10/2021")),
                new Victual(1, 100.0F, "Gamesa", new SimpleDateFormat("dd/MM/yyyy").parse("16/10/2021"))
        };

        ShopComponent shopComponent = new ShopComponent(products);
        shopComponent.setVisible(true);
    }
}
