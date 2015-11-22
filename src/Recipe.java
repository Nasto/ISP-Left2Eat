import javafx.scene.image.Image;

import java.util.List;
/**
 * TODO description
 */
//#if Cookbook
public class Recipe {
	
    private String title;
    private List<String> instructions; //Schritt für Schritt anleiten
    private Image image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<String> getInstruction() {
        return instructions;
    }

    public void addInstruction(String instruction) {
        this.instructions.add(instruction);
    }
}
//#endif