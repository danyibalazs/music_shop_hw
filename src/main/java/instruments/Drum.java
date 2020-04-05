package instruments;

import behaviour.IPlay;
import shop.ItemTypes;

public class Drum extends Instrument{

    private int bassDrumSize;

    public Drum(ItemTypes type, String make, String color, String material, double buyPrice, double sellPrice, int bassDrumSize) {
        super(type, make, color, material, buyPrice, sellPrice);
        this.bassDrumSize = bassDrumSize;
    }

    public int getBassDrumSize() {
        return bassDrumSize;
    }

    public String play() {
        return "Da-dum-da-dum";
    }

}
