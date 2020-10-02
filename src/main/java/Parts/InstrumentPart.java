package Parts;

import Behaviours.IChangeOwners;

public abstract class InstrumentPart implements IChangeOwners {

    private String name;
    private String owner;
    private String forInstrument;

    public InstrumentPart(String name, String forInstrument) {
        this.name = name;
        this.owner = null;
        this.forInstrument = forInstrument;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public String getForInstrument() {
        return forInstrument;
    }

    public void changeOwners(String newOwner){
        this.owner = newOwner;
    }

}
