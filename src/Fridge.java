import java.util.ArrayList;
import java.util.List;
/**
 * TODO description
 */
public class Fridge {
    private List<Food> content;
    
    public Fridge() {
		content = new ArrayList<Food>();
	}

    public List<Food> getContent() {
        return content;
    }

    public void addContent(Food content) {
        this.content.add(content);
    }
    
    public boolean removeContent(Food content){
    	return this.content.remove(content);
    }
}