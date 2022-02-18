package shop.stockItems;

public abstract class StockItem implements ISell{
    private String stockPrice;
    private String rrp;
    private String description;


    public StockItem(String stockPrice, String rrp, String description) {
        this.stockPrice = stockPrice;
        this.rrp = rrp;
        this.description = description;
    }

    public String getStockPrice() {
        return stockPrice;
    }

    public String getRrp() {
        return rrp;
    }

    public String getDescription() {
        return description;
    }
}
