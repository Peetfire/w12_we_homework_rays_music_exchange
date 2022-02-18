package shop.stockItems;

public abstract class StockItem implements ISell{
    private double stockPrice;
    private double rrp;
    private String description;


    public StockItem(double stockPrice, double rrp, String description) {
        this.stockPrice = stockPrice;
        this.rrp = rrp;
        this.description = description;
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
}
