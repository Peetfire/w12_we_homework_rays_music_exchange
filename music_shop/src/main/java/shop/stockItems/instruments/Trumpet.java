package shop.stockItems.instruments;

public class Trumpet extends Instrument{
    private String trumpetType;
    private String material;

    public Trumpet(double stockPrice, double rrp, String description, String make, String model, String colour, String type, String trumpetType, String material) {
        super(stockPrice, rrp, description, make, model, colour, type);
        this.trumpetType = trumpetType;
        this.material = material;
    }

    public String getTrumpetType() {
        return trumpetType;
    }

    public String getMaterial() {
        return material;
    }

    public String play(){
        return "Trumpet goes Toot Toot";
    }
}
