package Instruments.Keyboard;

public class Organ extends KeyboardInstrument {

    public Organ(String colour) {
        super(colour, 61, "Organ");
    }

    public String play(){
        return "plong, plooooong, plong-ploooooooooooong";
    }

}
