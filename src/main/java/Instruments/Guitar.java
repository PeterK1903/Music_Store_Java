package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numOfStrings;

    public Guitar(String material, InstrumentType type, String colour, double sellPrice, double buyPrice, int numOfStrings) {
        super(material, type, colour, sellPrice, buyPrice);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public void setNumOfStrings(int numOfStrings) {
        this.numOfStrings = numOfStrings;
    }

    public String play() {
        return "Strum Strum Strum";
    }

    public double calculateMarkup() {
        return  this.getBuyPrice() - this.getSellPrice()  ;
    }
}
