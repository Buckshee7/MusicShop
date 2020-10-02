package Instruments.Strings;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Banjo extends Instrument {

    private int Strings;

    public Banjo(String colour){
        super(InstrumentType.STRING, colour);
        this.Strings = 5;
    }

    public int getStrings() {
        return Strings;
    }

    public String play(){
        return "bara-na-na-na-ning-ning-ning";
    }


}
