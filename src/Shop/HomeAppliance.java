package Shop;

import java.util.Date;

public class HomeAppliance extends Product {
    private Date garanty;

    public HomeAppliance(int ID, float price, String brand, Date garanty) {
        super(ID, price, brand);
        this.garanty = garanty;
    }

    public Date getGaranty() {
        return garanty;
    }

    public void setGaranty(Date garanty) {
        this.garanty = garanty;
    }
}
