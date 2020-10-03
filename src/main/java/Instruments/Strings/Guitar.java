package Instruments.Strings;

import Exceptions.MissingInstrumentPartsException;

public class Guitar extends StringedInstrument {

    public Guitar(String colour, boolean soldWithStrings){
        super("Guitar", 6, colour, soldWithStrings);
    }

    public String play() throws MissingInstrumentPartsException {
        if (this.getStrings() == null) {
            throw new MissingInstrumentPartsException("Can't play with no strings!");
        }
        return "Zwwwwaaaang, dli-zwang!";
    }

}
