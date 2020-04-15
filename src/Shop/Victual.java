package Shop;

import java.util.Date;

public class Victual extends Product {
    private Date expiration;

    public Victual(int ID, float price, String brand, Date expiration) {
        super(ID, price, brand);
        this.expiration = expiration;
    }


    public Date getExpiration() {
        return expiration;
    }

    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }
}
