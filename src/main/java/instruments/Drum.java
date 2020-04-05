package instruments;

import behaviour.IPlay;

public class Drum extends Instrument{

    private int bassDrumSize;

    public Drum(int bassDrumSize) {
        this.bassDrumSize = bassDrumSize;
    }

    public int getBassDrumSize() {
        return bassDrumSize;
    }

    public String play() {
        return "Da-dum-da-dum";
    }

}
