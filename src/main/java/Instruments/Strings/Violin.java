package Instruments.Strings;

public class Violin extends StringedInstrument {

    public Violin(String colour, boolean soldWithStrings){
        super("Violin", 4, colour, soldWithStrings);
    }

    public String play(){
        return "** screeching cat **";
    }

}
