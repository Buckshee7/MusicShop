package Parts;


import Instruments.Strings.Banjo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    private Strings strings;

    @Before
    public void Strings(){
        this.strings = new Strings("Banjo");
    }

    @Test
    public void canGetPartName(){
        assertEquals("Banjo strings", this.strings.getName());
    }

    @Test
    public void canGetOwner(){
        assertEquals(null, this.strings.getOwner());
    }

    @Test
    public void canGetForWhichInstrument(){
        assertEquals("Banjo", this.strings.getForInstrument());
    }


    @Test
    public void canChangeOwner(){
        this.strings.changeOwners("the music man");
        assertEquals("the music man", this.strings.getOwner());
    }

}
