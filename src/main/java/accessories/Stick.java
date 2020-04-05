package accessories;

import shop.ItemTypes;

public class Stick extends Accessory {

    private String material;

    public Stick (ItemTypes type, double buyPrice, double sellPrice, String material){
        super(type, buyPrice, sellPrice);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
