package Instruments.Strings;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Guitar extends Instrument {

    private int Strings;

    public Guitar(String colour){
        super(InstrumentType.STRING, colour);
        this.Strings = 6;
    }

    public int getStrings() {
        return Strings;
    }

    public String play(){
        return "Zwwwwaaaang, dli-zwang!";
    }

    public static String getInstrumentName(){
        return "Guitar";
    };

}
