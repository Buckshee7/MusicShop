package Instruments.Keyboard;

public class Organ extends KeyboardInstrument {

    public Organ(String colour) {
        super(colour, 61);
    }

    public String play(){
        return "plong, plooooong, plong-ploooooooooooong";
    }

    public static String getInstrumentName(){
        return "Organ";
    };

}
