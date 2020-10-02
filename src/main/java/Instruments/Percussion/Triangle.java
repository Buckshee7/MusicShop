package Instruments.Percussion;

public class Triangle extends PercussionInstrument {

    public Triangle(String colour){
        super(colour, 10, "Triangle");
    }

    public String play(){
        return "Ting";
    }

}
