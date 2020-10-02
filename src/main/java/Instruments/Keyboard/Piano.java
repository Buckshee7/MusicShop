package Instruments.Keyboard;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Piano extends Instrument {

    private int keys;

    public Piano(String colour){
        super(InstrumentType.KEYBOARD, colour);
        this.keys = 88;
    }

    public int getKeys() {
        return keys;
    }

    public String play(){
        return "pling-plong-pling plongy-pling-plong";
    }

}
