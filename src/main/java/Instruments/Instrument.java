package Instruments;

import Behaviours.IChangeOwners;
import Behaviours.IPlay;

public abstract class Instrument implements IPlay, IChangeOwners {

    private InstrumentType type;
    private String colour;
    private String owner;

    public Instrument(InstrumentType type, String colour) {
        this.type = type;
        this.colour = colour;
        this.owner = null;
    }

    public String getType() {
        return type.toString();
    }

    public String getColour() {
        return colour;
    }

    public String getOwner() {
        return owner;
    }

    public void changeOwners(String newOwner){
        this.owner = newOwner;
    }

    public abstract String play();
}
