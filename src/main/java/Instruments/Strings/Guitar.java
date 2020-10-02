package Instruments.Strings;

import Instruments.Instrument;
import Instruments.InstrumentType;
import Parts.Strings;

public class Guitar extends StringedInstrument {

    public Guitar(String colour, boolean soldWithStrings){
        super(Guitar.getInstrumentName(), 6, colour, soldWithStrings);
    }

    public String play(){
        return "Zwwwwaaaang, dli-zwang!";
    }

    public static String getInstrumentName(){
        return "Guitar";
    };

}
