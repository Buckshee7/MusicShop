package Shop;

import Behaviours.IChangeOwners;
import Behaviours.ISell;
import Instruments.Instrument;
import Instruments.Keyboard.KeyboardInstrument;
import Instruments.Percussion.PercussionInstrument;
import Instruments.Strings.StringedInstrument;
import Parts.InstrumentPart;

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
            noise = String.format("Makes a noise like '%s'", instrumentItem.play());
            switch (instrumentItem.getType()){
                case KEYBOARD :
                    extraInfo = String.format("It has %d keys!", ((KeyboardInstrument) item).getKeys());
                    break;
                case PERCUSSION :
                    extraInfo = String.format("It maxes out at %d db!", ((PercussionInstrument) item).getMaxDecibels());
                    break;
                case STRING :
                    String needsStrings = ((StringedInstrument) item).getStrings() == null ? "strings sold separately" : "comes fully stringed!";
                    extraInfo = String.format("It takes %d strings (%s)!", ((StringedInstrument) item).getNumStrings(), needsStrings);
                    break;
                case WOODWIND:
                    extraInfo = String.format("It's %d inches long!", ((PercussionInstrument) item).getMaxDecibels());
                    break;
            }
        }
        if (this.item instanceof InstrumentPart){
            InstrumentPart partItem = (InstrumentPart) item;
            forInstrument = String.format("For use with the '%s'", partItem.getForInstrument());
        }
        return String.format("Brand new %s. %s%s", item.getName(), extraInfo, forInstrument);
    }

    public void sell(String newOwner){
        this.item.changeOwners(newOwner);
    }

    public double calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }


}
