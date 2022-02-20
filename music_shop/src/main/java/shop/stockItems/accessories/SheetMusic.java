package shop.stockItems.accessories;

public class SheetMusic extends Accessory{
    private String format;
    private String instrument;

    public SheetMusic(double stockPrice, double rrp, String description, String brand, String product, String category, String format, String instrument) {
        super(stockPrice, rrp, description, brand, product, category);
        this.format = format;
        this.instrument = instrument;
    }

    public String getFormat() {
        return format;
    }

    public String getInstrument() {
        return instrument;
    }
}
