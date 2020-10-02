import Instruments.InstrumentType;
import Instruments.Strings.Banjo;
import Instruments.Strings.Violin;
import Parts.Strings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    private Strings strings;

    @Before
    public void Strings(){
        this.strings = new Strings(Banjo.getInstrumentName());
    }

    @Test
    public void canGetNameAsString(){
        assertEquals("Banjo strings", this.strings.toString());
    }

    @Test
    public void canGetOwner(){
        assertEquals(null, this.strings.getOwner());
    }

    @Test
    public void canChangeOwner(){
        this.strings.changeOwners("the music man");
        assertEquals("the music man", this.strings.getOwner());
    }

}
