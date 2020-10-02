package Instruments.Strings;

import Instruments.Instrument;
import Instruments.InstrumentType;
import Parts.Strings;

public class Banjo extends Instrument {

    private int NumStrings;
    private Strings strings;

    public Banjo(String colour, boolean soldWithStrings){
        super(InstrumentType.STRING, colour);
        this.NumStrings = 5;
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
        return "bara-na-na-na-ning-ning-ning";
    }

    public static String getInstrumentName(){
        return "Banjo";
    };

}
