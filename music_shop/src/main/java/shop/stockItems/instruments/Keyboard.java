package shop.stockItems.instruments;

public class Keyboard extends Instrument{
    private String keyboardType;
    private int keyRange;

    public Keyboard(double stockPrice, double rrp, String description, String make, String model, String colour, String type, String keyboardType, int keyRange) {
        super(stockPrice, rrp, description, make, model, colour, type);
        this.keyboardType = keyboardType;
        this.keyRange = keyRange;
    }

    public String getKeyboardType() {
        return keyboardType;
    }

    public int getKeyRange() {
        return keyRange;
    }

    @Override
    public String play() {
        return "Keyboard goes tinklity tinkle...";
    }
}
