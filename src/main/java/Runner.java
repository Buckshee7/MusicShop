import Exceptions.MissingInstrumentPartsException;
import Instruments.Brass.Trumpet;
import Instruments.InstrumentType;
import Instruments.Keyboard.Organ;
import Instruments.Keyboard.Piano;
import Instruments.Percussion.Bongos;
import Instruments.Percussion.Drums;
import Instruments.Percussion.Triangle;
import Instruments.Strings.Banjo;
import Instruments.Strings.Guitar;
import Instruments.Strings.Violin;
import Instruments.Woodwind.Clarinet;
import Instruments.Woodwind.Flute;
import Instruments.Woodwind.Harmonica;
import Instruments.Woodwind.WoodwindInstrument;
import Parts.DrumSticks;
import Parts.Strings;
import Shop.Shop;
import Shop.ShopItem;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        Shop shop = Shop.getInstance();

        //create instruments
        Piano piano = new Piano("Pink");
        Organ organ = new Organ("Blue");
        Triangle triangle = new Triangle("Pink");
        Violin violin = new Violin("Pink", false);
        Flute flute = new Flute("pink");
        Trumpet trumpet = new Trumpet();
        Bongos bongos = new Bongos("Green");
        Drums drums = new Drums("Red");
        Banjo banjo = new Banjo("Maroon", true);
        Guitar guitar = new Guitar("See-through", false);
        Clarinet clarinet = new Clarinet("Silver");
        Harmonica harmonica = new Harmonica();

        DrumSticks drumsticks = new DrumSticks();
        Strings violinStrings = new Strings(violin.getName());

        //add items to shop
        shop.addItem(piano, 100.00, 200.00);
        shop.addItem(organ, 100.00, 200.00);
        shop.addItem(triangle, 100.00, 200.00);
        shop.addItem(violin, 100.00, 200.00);
        shop.addItem(flute, 100.00, 200.00);
        shop.addItem(trumpet, 100.00, 200.00);
        shop.addItem(bongos, 100.00, 200.00);
        shop.addItem(drums, 100.00, 200.00);
        shop.addItem(banjo, 100.00, 200.00);
        shop.addItem(guitar, 100.00, 200.00);
        shop.addItem(clarinet, 100.00, 200.00);
        shop.addItem(harmonica, 100.00, 200.00);
        shop.addItem(drumsticks, 100.00, 200.00);
        shop.addItem(violinStrings, 100.00, 200.00);

        //print number of items in stock
        System.out.println("Number of items in stock: " + shop.getStock().size());

        //prints number of stringed instruments and the array itself
        ArrayList<ShopItem> stringedInstruments = shop.getAllOfInstrumentGroup(InstrumentType.STRING);
        System.out.println("Number of instruments in " + InstrumentType.STRING.toString() + " group: " + stringedInstruments.size());
        System.out.println("Stringed instruments: " + stringedInstruments);

        //get description of violin
        System.out.println("Violin description: " + stringedInstruments.get(0).getDescription());

        //get description of banjo
        System.out.println("Banjo description: " + stringedInstruments.get(1).getDescription());

        //sell the banjo from the the list of stringed instruments returned in the previous step
        shop.sellItem(stringedInstruments.get(1), "tim");
        System.out.println("Number of items now left in stock: " + shop.getStock().size());

        //play the flute
        try {
            String fluteSound = ((WoodwindInstrument) shop.getAllOfInstrumentGroup(InstrumentType.WOODWIND).get(0).getItem()).play();
            System.out.println("Noise a flute makes: " + "'" + fluteSound + "'");
        } catch(MissingInstrumentPartsException ex){
            System.out.println(ex.getMessage());
        }

        //get total potential profit for store
        double profit = shop.getPotentialProfit();
        System.out.println("Total potential profit for store: " + profit);
    }

}
