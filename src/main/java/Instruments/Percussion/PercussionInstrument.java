package Instruments.Percussion;

import Instruments.Instrument;
import Instruments.InstrumentType;

public abstract class PercussionInstrument extends Instrument {

    private int maxDecibels;

    public PercussionInstrument(String colour, int maxDecibels){
        super(InstrumentType.PERCUSSION, colour);
        this.maxDecibels = maxDecibels;
    }

    public int getMaxDecibels() {
        return maxDecibels;
    }

}
