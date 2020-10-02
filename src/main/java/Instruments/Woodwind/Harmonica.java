package Instruments.Woodwind;

import Instruments.Instrument;
import Instruments.InstrumentType;

public class Harmonica extends Instrument {

    private int length;

    public Harmonica(){
        super(InstrumentType.WOODWIND, "Silver");
        this.length = 4;
    }

    public int getLength() {
        return length;
    }

    public String play(){
        return "I AM THE INDESCRIBABLE NOISE A HARMONICA MAKES";
    }

}
