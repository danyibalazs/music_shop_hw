package instruments;

import behaviour.IPlay;
import shop.ItemTypes;

public class Keyboard extends Instrument {

    private int numberOfKeys;

    public Keyboard(ItemTypes type, String make, String color, String material, double buyPrice, double sellPrice, int numberOfKeys){
        super(type, make, color, material, buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "Plink";
    }
}
