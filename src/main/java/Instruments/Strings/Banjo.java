package Instruments.Strings;

import Instruments.Instrument;
import Instruments.InstrumentType;
import Parts.Strings;

public class Banjo extends StringedInstrument {

    public Banjo(String colour, boolean soldWithStrings){
        super(Banjo.getInstrumentName(), 5, colour, soldWithStrings);
    }

    public String play(){
        return "bara-na-na-na-ning-ning-ning";
    }

    public static String getInstrumentName(){
        return "Banjo";
    };

}
