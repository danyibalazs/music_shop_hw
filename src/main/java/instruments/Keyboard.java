package instruments;

import behaviour.IPlay;

public class Keyboard implements IPlay {

    private int numberOfKeys;

    public Keyboard(int numberOfKeys){
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play() {
        return "Plink";
    }
}
