package Instruments.Strings;

public class Guitar extends StringedInstrument {

    public Guitar(String colour, boolean soldWithStrings){
        super("Guitar", 6, colour, soldWithStrings);
    }

    public String play(){
        return "Zwwwwaaaang, dli-zwang!";
    }

}
