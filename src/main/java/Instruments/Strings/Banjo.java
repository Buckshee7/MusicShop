package Instruments.Strings;

import Exceptions.MissingInstrumentPartsException;

public class Banjo extends StringedInstrument {

    public Banjo(String colour, boolean soldWithStrings){
        super("Banjo", 5, colour, soldWithStrings);
    }

    public String play() throws MissingInstrumentPartsException {
        if (this.getStrings() == null) {
            throw new MissingInstrumentPartsException("Can't play with no strings!");
        }
        return "bara-na-na-na-ning-ning-ning";
    }

}
