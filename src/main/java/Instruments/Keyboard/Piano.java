package Instruments.Keyboard;

public class Piano extends KeyboardInstrument {

    public Piano(String colour){
        super(colour, 88, "Organ");
    }

    public String play(){
        return "pling-plong-pling plongy-pling-plong";
    }

}
