package Instruments.Strings;

public class Banjo extends StringedInstrument {

    public Banjo(String colour, boolean soldWithStrings){
        super("Banjo", 5, colour, soldWithStrings);
    }

    public String play(){
        return "bara-na-na-na-ning-ning-ning";
    }

}
