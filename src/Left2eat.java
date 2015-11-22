//#if Colours
import java.util.List;

import javafx.scene.paint.Color;
//#endif

/**
 * TODO description
 */
public class Left2eat {

    public Language language;
    
    //#if Cookbook
    public Cookbook cookbook = null; // Public damit es von überall zugreifbar bleibt
    //#endif
    
    //#if Reminder
    public Reminder reminder = null;
    //#endif
    
    //#if ShoppingList
    public ShoppingList shoppingList = null;
    //#endif
    
    //#if MultipleFridges
    public List<Fridge> fridges;
    //#else
    public Fridge fridge;
    //#endif

    //#if Colours
    private Color good = Color.GREEN;
    private Color warn = Color.YELLOW;
    private Color rotten = Color.BROWN;
    //#endif

    public Left2eat() {
		//#if deDE
		language = Language.deDE;
		//#elif deAU
		language = Language.deAU;
		//#elif enGB
		language = Language.enGB;
		//#elif enUS
		language = Language.enUS;
		//#endif
		
		fridge = new Fridge();
	}
    
    //#if ChooseColours
    public void setColours(Color good, Color warn, Color rotten){
    	this.good = good;
    	this.warn = warn;
    	this.rotten = rotten;
    }
    //#endif
}
