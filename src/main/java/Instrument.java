public abstract class Instrument implements IPlay, ISell{

    private InstrumentType type;
    private String material;

    public Instrument(InstrumentType type) {
        this.type = type;
    }

    public InstrumentType getType() {
        return type;
    }
}
