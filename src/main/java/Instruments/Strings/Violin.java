package Instruments.Strings;

import Exceptions.MissingInstrumentPartsException;

public class Violin extends StringedInstrument {

    public Violin(String colour, boolean soldWithStrings){
        super("Violin", 4, colour, soldWithStrings);
    }

    public String play() throws MissingInstrumentPartsException {
        if (this.getStrings() == null) {
            throw new MissingInstrumentPartsException("Can't play with no strings!");
        }
        return "** screeching cat **";
    }

}
