package Instruments.Woodwind;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Clarinet extends WoodwindInstrument {

    public Clarinet(String colour){
        super(colour, 26);
    }

    public String play(){
        return "doo-di-loo-oo";
    }

    public static String getInstrumentName(){
        return "Clarinet";
    }
}
