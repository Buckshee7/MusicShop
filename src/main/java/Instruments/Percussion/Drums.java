package Instruments.Percussion;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Drums extends Instrument {

    private int maxDecibels;

    public Drums(String colour){
        super(InstrumentType.PERCUSSION, colour);
        this.maxDecibels = 70;
    }

    public int getMaxDecibels() {
        return maxDecibels;
    }

    public String play(){
        return "bang-boom boom-bang tish!";
    }

}
