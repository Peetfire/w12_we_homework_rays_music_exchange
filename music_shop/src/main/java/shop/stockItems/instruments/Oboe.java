package shop.stockItems.instruments;

public class Oboe extends Instrument {
    private String oboeType;
    private String material;

    public Oboe(double stockPrice, double rrp, String description, String make, String model, String colour, String type, String oboeType, String material) {
        super(stockPrice, rrp, description, make, model, colour, type);
        this.oboeType = oboeType;
        this.material = material;


    }

    public String getOboeType() {
        return oboeType;
    }

    public String getMaterial() {
        return material;
    }


    @Override
    public String play() {
        return "Oboe goes noodlely nood nood";
    }
}

