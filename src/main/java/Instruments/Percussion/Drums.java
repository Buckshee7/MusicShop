package Instruments.Percussion;

public class Drums extends PercussionInstrument {

    public Drums(String colour){
        super(colour, 70, "Drums");
    }

    public String play(){
        return "bang-boom boom-bang tish!";
    }

}
