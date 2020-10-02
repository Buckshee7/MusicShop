public abstract class Instrument implements IPlay{

    private InstrumentType type;

    public Instrument(InstrumentType type) {
        this.type = type;
    }

    public InstrumentType getType() {
        return type;
    }
}
