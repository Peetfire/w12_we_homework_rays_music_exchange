package shop.stockItems.instruments;

public class Guitar extends Instrument{
    private int noOfStrings;
    private String guitarType;

    public Guitar(double stockPrice, double rrp, String description, String make, String model, String colour, String type, int noOfStrings, String guitarType) {
        super(stockPrice, rrp, description, make, model, colour, type);
        this.noOfStrings = noOfStrings;
        this.guitarType = guitarType;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String getGuitarType() {
        return guitarType;
    }




    @Override
    public String play() {
        return "Guitar goes strumity strum strum...";
    }
}
