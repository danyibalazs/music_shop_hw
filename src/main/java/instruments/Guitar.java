package instruments;

import behaviour.IPlay;
import shop.ItemTypes;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar( ItemTypes type, String make, String color, String material, double buyPrice, double sellPrice, int numberOfStrings){
        super(type, make, color, material, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Chunka Chunk";
    }
}
