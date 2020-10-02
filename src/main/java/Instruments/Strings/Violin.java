package Instruments.Strings;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Violin extends Instrument {

    private int Strings;

    public Violin(String colour){
        super(InstrumentType.STRING, colour);
        this.Strings = 4;
    }

    public int getStrings() {
        return Strings;
    }

    public String play(){
        return "** screeching cat **";
    }

}
