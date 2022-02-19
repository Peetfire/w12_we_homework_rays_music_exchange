package shop.stockItems.accessories;

public class OboeReed extends Accessory{
    private String reedType;
    private String reedStrength;

    public OboeReed(double stockPrice, double rrp, String description, String brand, String product, String category, String reedType, String reedStrength) {
        super(stockPrice, rrp, description, brand, product, category);
        this.reedType = reedType;
        this.reedStrength = reedStrength;
    }

    public String getReedType() {
        return reedType;
    }

    public String getReedStrength() {
        return reedStrength;
    }
}
