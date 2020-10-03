package Instruments;

import Behaviours.IChangeOwners;
import Behaviours.IPlay;
import Exceptions.MissingInstrumentPartsException;

public abstract class Instrument implements IPlay, IChangeOwners {

    private InstrumentType type;
    private String colour;
    private String owner;
    private String instrumentName;

    public Instrument(InstrumentType type, String colour, String instrumentName) {
        this.type = type;
        this.colour = colour;
        this.owner = null;
        this.instrumentName = instrumentName;
    }

    public String getName() {
        return instrumentName;
    }

    public InstrumentType getType() {
        return this.type;
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

    public abstract String play() throws MissingInstrumentPartsException;

}
