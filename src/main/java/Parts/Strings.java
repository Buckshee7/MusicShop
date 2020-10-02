package Parts;

import Behaviours.IChangeOwners;
import Instruments.Instrument;

public class Strings implements IChangeOwners {

    private String owner;
    private String forInstrument;

    public Strings(String forInstrument) {
        this.owner = null;
        this.forInstrument = forInstrument;
    }

    public String toString() {
        return this.forInstrument + " strings";
    }

    public String getOwner() {
        return owner;
    }

    public void changeOwners(String newOwner){
        this.owner = newOwner;
    }

}
