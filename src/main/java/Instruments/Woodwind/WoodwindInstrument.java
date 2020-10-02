package Instruments.Woodwind;

import Instruments.Instrument;
import Instruments.InstrumentType;

public abstract class WoodwindInstrument extends Instrument {

    private int length;

    public WoodwindInstrument(String colour, int length){
        super(InstrumentType.WOODWIND, colour);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

}
