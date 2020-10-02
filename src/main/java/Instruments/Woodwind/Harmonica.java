package Instruments.Woodwind;

public class Harmonica extends WoodwindInstrument {

    public Harmonica(){
        super("Silver", 4);
    }

    public String play(){
        return "I AM THE INDESCRIBABLE NOISE A HARMONICA MAKES";
    }

    public static String getInstrumentName(){
        return "Harmonica";
    };

}
