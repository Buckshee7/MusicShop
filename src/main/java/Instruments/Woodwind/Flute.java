package Instruments.Woodwind;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Flute extends Instrument {

    private int length;

    public Flute(String colour){
        super(InstrumentType.WOODWIND, colour);
        this.length = 26;
    }

    public int getLength() {
        return length;
    }

    public String play(){
        return "...and one time, at bandcamp...";
    }

}
