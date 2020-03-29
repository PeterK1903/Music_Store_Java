package Instruments;

public class Instrument {

    // instance vars
    private String material;
    private InstrumentType type;
    private String colour;
    private double buyPrice;
    private double sellPrice;


    // constructor

    public Instrument(String material, InstrumentType type, String colour, double buyPrice, double sellPrice) {
        this.material = material;
        this.type = type;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    // getters
    public String getMaterial() {
        return material;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getColour() {
        return colour;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    // setters
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
