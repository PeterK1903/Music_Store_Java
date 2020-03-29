package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {

    private int numOfValves;

    public Trumpet(String material, InstrumentType type, String colour, double sellPrice, double buyPrice, int numOfValves) {
        super(material, type, colour, sellPrice, buyPrice);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves;
    }

    public void setNumOfValves(int numOfValves) {
        this.numOfValves = numOfValves;
    }

    public String play() {
        return "Trrrrrrummmmpet";
    }

    public double calculateMarkup() {
        return this.getBuyPrice() - this.getSellPrice();
    }
}
