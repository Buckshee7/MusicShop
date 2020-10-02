package Instruments.Keyboard;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Organ extends Instrument {

    private int keys;

    public Organ(String colour){
        super(InstrumentType.KEYBOARD, colour);
        this.keys = 61;
    }

    public Organ(InstrumentType type, String colour, int keys) {
        super(type, colour);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    public String play(){
        return "plong, plooooong, plong-ploooooooooooong";
    }

}
