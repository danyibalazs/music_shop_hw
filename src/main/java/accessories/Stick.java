package accessories;

public class Stick extends Accessory {

    private String material;

    public Stick (String type, double buyPrice, double sellPrice, String material){
        super(type, buyPrice, sellPrice);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
