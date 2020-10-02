package Instruments.Percussion;

public class Triangle extends PercussionInstrument {

    public Triangle(String colour){
        super(colour, 10);
    }

    public String play(){
        return "Ting";
    }

    public static String getInstrumentName(){
        return "Triangle";
    };

}
