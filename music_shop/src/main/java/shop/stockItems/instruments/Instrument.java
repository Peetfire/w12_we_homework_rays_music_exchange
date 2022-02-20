package shop.stockItems.instruments;

import shop.stockItems.ISell;
import shop.stockItems.StockItem;

public abstract class Instrument implements IPlay, ISell {
    private double stockPrice;
    private double rrp;
    private String description;
    private String make;
    private String model;
    private String colour;
    private String type;

    public Instrument(double stockPrice, double rrp, String description, String make, String model, String colour, String type) {
        this.stockPrice = stockPrice;
        this.rrp = rrp;
        this.description = description;
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
