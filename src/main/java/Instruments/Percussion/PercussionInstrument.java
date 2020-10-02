package Instruments.Percussion;

import Instruments.Instrument;
import Instruments.InstrumentType;

public abstract class PercussionInstrument extends Instrument {

    private int maxDecibels;

    public PercussionInstrument(String colour, int maxDecibels, String name){
        super(InstrumentType.PERCUSSION, colour, name);
        this.maxDecibels = maxDecibels;
    }

    public int getMaxDecibels() {
        return maxDecibels;
    }

}
