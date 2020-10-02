package Instruments.Woodwind;

import Instruments.Instrument;
import Instruments.InstrumentType;

public abstract class WoodwindInstrument extends Instrument {

    private int length;

    public WoodwindInstrument(String colour, int length, String instrumentName){
        super(InstrumentType.WOODWIND, colour, instrumentName);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

}
