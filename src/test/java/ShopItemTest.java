import Instruments.Brass.Trumpet;
import Instruments.Keyboard.Piano;
import Instruments.Percussion.Triangle;

import Instruments.Strings.Violin;
import Instruments.Woodwind.Flute;
import Parts.Strings;
import Shop.ShopItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopItemTest {

    private ShopItem keyboardItem;
    private ShopItem brassItem;
    private ShopItem percussionItem;
    private ShopItem stringsItem;
    private ShopItem woodwindItem;
    private ShopItem partItem;
    private Trumpet trumpet = new Trumpet();;

    @Before
    public void before(){
        Piano piano = new Piano("Pink");
        Triangle triangle = new Triangle("Pink");
        Violin violin = new Violin("Pink", false);
        Flute flute = new Flute("pink");
        Strings violinStrings = new Strings(violin.getName());

        this.keyboardItem = new ShopItem(100.00, 200.00, piano);
        this.brassItem = new ShopItem(100.00, 200.00, trumpet);
        this.percussionItem = new ShopItem(100.00, 200.00, triangle);
        this.stringsItem = new ShopItem(100.00, 200.00, violin);
        this.woodwindItem = new ShopItem(100.00, 200.00, flute);
        this.partItem = new ShopItem(100.00, 200.00, violinStrings);
    }

    @Test
    public void canGetBuyPrice(){
        assertEquals(100.00, this.keyboardItem.getBuyPrice(), 0.01);
    }

    @Test
    public void canGetSellPrice(){
        assertEquals(200.00, this.keyboardItem.getSellPrice(), 0.01);
    }

    @Test
    public void canGetDescriptionKeyboard(){
        assertEquals("Brand new Organ. It has 88 keys! Makes a noise like 'pling-plong-pling plongy-pling-plong'", this.keyboardItem.getDescription());
    }

    @Test
    public void canGetDescriptionFlute(){
        assertEquals("Brand new Flute. It's 26 inches long! Makes a noise like '...and one time, at bandcamp...'", this.woodwindItem.getDescription());
    }

    @Test
    public void canGetDescriptionViolinWithoutStrings(){
        assertEquals("Brand new Violin. It takes 4 strings (Strings sold separately)! Makes a noise like '** screeching cat **'", this.stringsItem.getDescription());
    }

    @Test
    public void canGetDescriptionViolinWithStrings(){
        Violin stringedViolin = new Violin("blue", true);
        this.stringsItem = new ShopItem(100.00, 200.00, stringedViolin);
        assertEquals("Brand new Violin. It takes 4 strings (Comes fully stringed!)! Makes a noise like '** screeching cat **'", this.stringsItem.getDescription());
    }

    @Test
    public void canGetDescriptionTriangle(){
        assertEquals("Brand new Triangle. It maxes out at 10 db! Makes a noise like 'Ting'", this.percussionItem.getDescription());
    }

    @Test
    public void canGetItem(){
        assertEquals(trumpet, this.brassItem.getItem());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100.00, this.keyboardItem.calculateMarkup(), 0.01);
    }

    @Test
    public void canSellItem(){
        this.stringsItem.sell("Tim");
        assertEquals("Tim", this.stringsItem.getItem().getOwner());
    }

}
