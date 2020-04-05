package instruments;

import behaviour.IPlay;

public class Guitar implements IPlay {

    private int numberOfStrings;

    public Guitar(int numberOfStrings){
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play(){
        return "Chunka Chunk";
    }
}
