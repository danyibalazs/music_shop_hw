package accessories;

public class Amp extends Accessory {

    private int power;

    private Amp(String type, double buyPrice, double sellPrice, int power){
        super(type, buyPrice, sellPrice);
        this.power = power;

    }

    public int getPower() {
        return power;
    }
}
