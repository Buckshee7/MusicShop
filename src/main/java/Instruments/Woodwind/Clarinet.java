package Instruments.Woodwind;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Clarinet extends Instrument {

    private int length;

    public Clarinet(String colour){
        super(InstrumentType.WOODWIND, colour);
        this.length = 26;
    }

    public int getLength() {
        return length;
    }

    public String play(){
        return "doo-di-loo-oo";
    }

}
