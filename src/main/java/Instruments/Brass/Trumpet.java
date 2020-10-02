package Instruments.Brass;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Trumpet extends Instrument {

    public Trumpet(){
        super(InstrumentType.BRASS, "Brass");
    }

    public String play(){
        return "toot toot";
    }

}
