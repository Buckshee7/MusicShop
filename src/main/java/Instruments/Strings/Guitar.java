package Instruments.Strings;

import Instruments.Instrument;
import Instruments.InstrumentType;
import Parts.Strings;

public class Guitar extends Instrument {

    private int NumStrings;
    private Strings strings;

    public Guitar(String colour, boolean soldWithStrings){
        super(InstrumentType.STRING, colour);
        this.NumStrings = 6;
        this.strings = soldWithStrings ? new Strings(Guitar.getInstrumentName()): null;
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

    public String play(){
        return "Zwwwwaaaang, dli-zwang!";
    }

    public static String getInstrumentName(){
        return "Guitar";
    };

}
