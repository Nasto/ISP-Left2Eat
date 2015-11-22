import java.util.List;
/**
 * TODO description
 */
public class Fridge {
    private List<Food> content;

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