package Shop;

import Behaviours.IChangeOwners;
import Behaviours.ISell;
import Exceptions.MissingInstrumentPartsException;
import Instruments.Instrument;
import Instruments.Keyboard.KeyboardInstrument;
import Instruments.Percussion.PercussionInstrument;
import Instruments.Strings.StringedInstrument;
import Instruments.Woodwind.WoodwindInstrument;
import Parts.InstrumentPart;
import Parts.Strings;

public class ShopItem implements ISell {

    private double buyPrice;
    private double sellPrice;
    private String description;
    private IChangeOwners item;

    public ShopItem(double buyPrice, double sellPrice, IChangeOwners item) {
        this.item = item;
        this.description = this.makeDescription();
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    private String makeDescription(){
        String noise = "";
        String forInstrument = "";
        String extraInfo = "";
        if (this.item instanceof Instrument){
            Instrument instrumentItem = (Instrument) item;
            try {
                noise = String.format(" Makes a noise like '%s'", instrumentItem.play());
            }
            catch (MissingInstrumentPartsException ex){
                if (ex.getMessage() == "Can't play with no strings!"){
                    Strings temporaryStrings = new Strings(instrumentItem.getName());
                    ((StringedInstrument) instrumentItem).addStrings(temporaryStrings);
                    try {
                        noise = String.format(" Makes a noise like '%s'", instrumentItem.play());
                        ((StringedInstrument) instrumentItem).removeStrings();
                    }
                    catch (MissingInstrumentPartsException ex2){
                        //do nothing, move on
                    }
                }
            }
            switch (instrumentItem.getType()){
                case KEYBOARD :
                    extraInfo = String.format(" It has %d keys!", ((KeyboardInstrument) item).getKeys());
                    break;
                case PERCUSSION :
                    extraInfo = String.format(" It maxes out at %d db!", ((PercussionInstrument) item).getMaxDecibels());
                    break;
                case STRING :
                    String needsStrings = ((StringedInstrument) item).getStrings() == null ? "Strings sold separately" : "Comes fully stringed!";
                    extraInfo = String.format(" It takes %d strings (%s)!", ((StringedInstrument) item).getNumStrings(), needsStrings);
                    break;
                case WOODWIND:
                    extraInfo = String.format(" It's %d inches long!", ((WoodwindInstrument) item).getLength());
                    break;
            }
        }
        if (this.item instanceof InstrumentPart){
            InstrumentPart partItem = (InstrumentPart) item;
            forInstrument = String.format(" For use with the '%s'", partItem.getForInstrument());
        }
        return String.format("Brand new %s.%s%s%s", item.getName(), extraInfo, forInstrument, noise);
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public IChangeOwners getItem() {
        return item;
    }

    public void sell(String newOwner){
        this.item.changeOwners(newOwner);
    }

    public double calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }

    public String toString(){
        return this.item.getName();
    }

}
