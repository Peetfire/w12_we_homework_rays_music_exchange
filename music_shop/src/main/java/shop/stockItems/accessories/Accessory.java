package shop.stockItems.accessories;

import shop.stockItems.StockItem;

public class Accessory extends StockItem {
    private String brand;
    private String product;
    private String category;

    public Accessory(double stockPrice, double rrp, String description, String brand, String product, String category) {
        super(stockPrice, rrp, description);
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

    @Override
    public double calculateMarkup() {
        return this.getRrp() - this.getStockPrice();
    }
}
