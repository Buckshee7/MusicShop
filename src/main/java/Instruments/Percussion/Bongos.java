package Instruments.Percussion;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Bongos extends Instrument {

    private int maxDecibels;

    public Bongos(String colour){
        super(InstrumentType.PERCUSSION, colour);
        this.maxDecibels = 30;
    }

    public int getMaxDecibels() {
        return maxDecibels;
    }

    public String play(){
        return "bop-bop-boppo-bop-bop";
    }

    public static String getInstrumentName(){
        return "Bongos";
    };

}
