package Instruments;

import Behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private InstrumentType type;
    private String colour;

    public Instrument(InstrumentType type, String colour) {
        this.type = type;
        this.colour = colour;
    }

    public String getType() {
        return type.toString();
    }

    public String getColour() {
        return colour;
    }

    public abstract String play();
}
