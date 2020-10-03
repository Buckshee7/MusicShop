import Instruments.Brass.Trumpet;
import Instruments.Keyboard.Piano;
import Instruments.Percussion.Triangle;
import Instruments.Strings.Banjo;
import Instruments.Woodwind.Flute;
import Parts.Strings;
import Shop.ShopItem;
import org.junit.Before;

public class ShopItemTest {

    private ShopItem keyboardItem;
    private ShopItem brassItem;
    private ShopItem percussionItem;
    private ShopItem stringsItem;
    private ShopItem woodwindItem;
    private ShopItem partItem;

    @Before
    public void before(){
        Trumpet trumpet = new Trumpet();
        Piano piano = new Piano("Pink");
        Triangle triangle = new Triangle("Pink");
        Banjo banjo = new Banjo("Pink", false);
        Flute flute = new Flute("pink");
        Strings strings = new Strings(banjo.getName());



    }


}
