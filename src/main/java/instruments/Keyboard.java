package instruments;

import behaviour.IPlay;

public class Keyboard extends Instrument {

    private int numberOfKeys;

    public Keyboard(String make, String type, String color, String material, double buyPrice, double sellPrice, int numberOfKeys){
        super(make, type, color, material, buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "Plink";
    }
}
