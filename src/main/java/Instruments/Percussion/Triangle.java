package Instruments.Percussion;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Triangle extends Instrument {

    private int maxDecibels;

    public Triangle(String colour){
        super(InstrumentType.PERCUSSION, colour);
        this.maxDecibels = 10;
    }

    public int getMaxDecibels() {
        return maxDecibels;
    }

    public String play(){
        return "Ting";
    }

}
