package shop.stockItems.accessories;

public class GuitarString extends Accessory{
    private String stringType;
    private String gauge;

    public GuitarString(double stockPrice, double rrp, String description, String brand, String product, String category, String stringType, String gauge) {
        super(stockPrice, rrp, description, brand, product, category);
        this.stringType = stringType;
        this.gauge = gauge;
    }

    public String getStringType() {
        return stringType;
    }

    public String getGauge() {
        return gauge;
    }
}
