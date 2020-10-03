package Shop;

import Behaviours.IChangeOwners;
import Behaviours.ISell;
import Instruments.Instrument;
import Instruments.InstrumentType;

import java.util.ArrayList;

public class Shop {

    private static Shop shopInstance = null;

    private ArrayList<ShopItem> stock;

    private Shop(){
        this.stock = new ArrayList<>();
    }

    public static Shop getInstance(){
        if (shopInstance == null){
            shopInstance = new Shop();
        }
        return shopInstance;
    }

    public ArrayList<ShopItem> getStock() {
        return stock;
    }

    public ArrayList<ShopItem> getAllOfInstrumentGroup(InstrumentType type) {
        ArrayList<ShopItem> returnList = new ArrayList<>();
        stock.stream().forEach((item) -> {
                if (item.getItem() instanceof Instrument){
                    if (((Instrument) item.getItem()).getType() == type){
                        returnList.add(item);
                    }
                }
        });
        return returnList;
    }

    public void addItem(IChangeOwners item, double buyPrice, double sellPrice){
        item.changeOwners("shop");
        ShopItem shopItem = new ShopItem(buyPrice, sellPrice, item);
        this.stock.add(shopItem);
    }

    public void sellItem(ShopItem item, String customer){
        item.getItem().changeOwners(customer);
        this.stock.remove(item);
        System.out.println(String.format("Shop sold %s to %s.", item.getItem().getName(), customer));
    }

    public double getPotentialProfit(){
        return stock
                .stream()
                .map((item)->item.calculateMarkup())
                .reduce(0.0, (total, markUp) -> total + markUp);
    }

}
