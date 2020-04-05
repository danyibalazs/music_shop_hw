package instruments;

import behaviour.IPlay;

public class Drum extends Instrument{

    private int bassDrumSize;

    public Drum(String make, String type, String color, String material, double buyPrice, double sellPrice, int bassDrumSize) {
        super(make, type, color, material, buyPrice, sellPrice);
        this.bassDrumSize = bassDrumSize;
    }

    public int getBassDrumSize() {
        return bassDrumSize;
    }

    public String play() {
        return "Da-dum-da-dum";
    }

}
