package shop.stockItems.instruments;

import shop.stockItems.StockItem;

public abstract class Instrument extends StockItem implements IPlay{
    private String make;
    private String model;
    private String colour;
    private String type;

    public Instrument(double stockPrice, double rrp, String description, String make, String model, String colour, String type) {
        super(stockPrice, rrp, description);
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }
}
