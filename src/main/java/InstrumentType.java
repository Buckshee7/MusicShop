public enum InstrumentType {

    WOODWIND("Woodwind"),
    STRING("String"),
    PERCUSSION("Percussion"),
    BRASS("Brass"),
    KEYBOARD("Keyboard");

    private String typeName;

    InstrumentType(String typeName) {
        this.typeName = typeName;
    }
    
    public String toString() {
        return typeName;
    }
}
