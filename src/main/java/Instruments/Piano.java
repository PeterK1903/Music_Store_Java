package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private int numOfKeys;

    public Piano(String material, InstrumentType type, String colour, double sellPrice, double buyPrice, int numOfKeys) {
        super(material, type, colour, sellPrice, buyPrice);
        this.numOfKeys = numOfKeys;
    }

    public int getNumOfKeys() {
        return numOfKeys;
    }

    public void setNumOfKeys(int numOfKeys) {
        this.numOfKeys = numOfKeys;
    }

    public String play() {
        return "PIA-PIA-PIANO";
    }

    public double calculateMarkup() {
        return  this.getBuyPrice() - this.getSellPrice();
    }
}
