package Instruments.Strings;

import Instruments.Instrument;
import Instruments.InstrumentType;
import Parts.Strings;

public abstract class StringedInstrument extends Instrument {

    private int NumStrings;
    private Strings strings;

    public StringedInstrument(String instrumentName, int NumStrings, String colour, boolean soldWithStrings){
        super(InstrumentType.STRING, colour);
        this.NumStrings = NumStrings;
        this.strings = soldWithStrings ? new Strings(instrumentName): null;
    }

    public int getNumStrings() {
        return NumStrings;
    }

    public Strings getStrings() {
        return strings;
    }

    public void addStrings(Strings strings) {
        this.strings = strings;
    }

    public void removeStrings() {
        this.strings = null;
    }



}
