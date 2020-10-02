package Instruments.Woodwind;

public class Flute extends WoodwindInstrument {

    public Flute(String colour){
        super(colour, 26);
    }

    public String play(){
        return "...and one time, at bandcamp...";
    }

    public static String getInstrumentName(){
        return "Flute";
    }

}
