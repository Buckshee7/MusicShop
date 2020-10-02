package Shop;

import Behaviours.IChangeOwners;
import Instruments.Instrument;
import Parts.InstrumentPart;

public class SaleItem {

    private double buyPrice;
    private double sellPrice;
    private String description;
    private IChangeOwners item;

    public SaleItem(double buyPrice, double sellPrice, IChangeOwners item) {

        this.description = this.makeDescription();
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    private String makeDescription(){
        String noise = "";
        String forInstrument = "";
        if (this.item instanceof Instrument){
            Instrument instrumentItem = (Instrument) item;
            noise = String.format("Makes a noise like '%s'", instrumentItem.play());
        }
        if (this.item instanceof InstrumentPart){
            InstrumentPart partItem = (InstrumentPart) item;
            forInstrument = String.format("For use with the '%s'", partItem.getForInstrument());
        }
        return String.format("Brand new %s.%s%s");
    }


}
