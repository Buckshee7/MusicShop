package Instruments.Percussion;

public class Bongos extends PercussionInstrument {

    public Bongos(String colour){
        super(colour, 30, "Bongos");
    }

    public String play(){
        return "bop-bop-boppo-bop-bop";
    }

}
