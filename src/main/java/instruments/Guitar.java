package instruments;

import behaviour.IPlay;

public class Guitar extends Instrument {

    private int numberOfStrings;

    public Guitar(String make, String type, String color, String material, double buyPrice, double sellPrice, int numberOfStrings){
        super(make, type, color, material, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Chunka Chunk";
    }
}
