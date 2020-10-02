package Instruments.Keyboard;

import Instruments.Instrument;
import Instruments.InstrumentType;

public abstract class KeyboardInstrument extends Instrument {

    private int keys;

    public KeyboardInstrument(String colour, int keys, String instrumentName) {
        super(InstrumentType.KEYBOARD, colour, instrumentName);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

}
