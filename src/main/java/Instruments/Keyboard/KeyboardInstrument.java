package Instruments.Keyboard;

import Instruments.Instrument;
import Instruments.InstrumentType;

public abstract class KeyboardInstrument extends Instrument {

    private int keys;

    public KeyboardInstrument(String colour, int keys) {
        super(InstrumentType.KEYBOARD, colour);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

}
