package Instruments.Strings;

import Instruments.Instrument;
import Instruments.InstrumentType;
import Parts.Strings;

public class Violin extends StringedInstrument {

    public Violin(String colour, boolean soldWithStrings){
        super(Violin.getInstrumentName(), 4, colour, soldWithStrings);
    }

    public String play(){
        return "** screeching cat **";
    }

    public static String getInstrumentName(){
        return "Violin";
    };

}
