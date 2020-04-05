package accessories;

import shop.ItemTypes;

public class Amp extends Accessory {

    private int power;

    public Amp(ItemTypes type, double buyPrice, double sellPrice, int power){
        super(type, buyPrice, sellPrice);
        this.power = power;

    }

    public int getPower() {
        return power;
    }
}
