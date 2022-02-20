package shop.stockItems.accessories;

import shop.stockItems.ISell;
import shop.stockItems.StockItem;

public class Accessory implements ISell {
    private double stockPrice;
    private double rrp;
    private String description;
    private String brand;
    private String product;
    private String category;


    public Accessory(double stockPrice, double rrp, String description, String brand, String product, String category) {
        this.stockPrice = stockPrice;
        this.rrp = rrp;
        this.description = description;
        this.brand = brand;
        this.product = product;
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public String getProduct() {
        return product;
    }

    public String getCategory() {
        return category;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public double getRrp() {
        return rrp;
    }

    public String getDescription() {
        return description;
    }
    @Override
    public double calculateMarkup() {
        return this.getRrp() - this.getStockPrice();
    }
}
