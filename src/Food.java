/**
 * TODO description
 */
public abstract class Food {
    
	private String label;
    private Foodtype type;

    // da Private, brauchen wir auch getter und setter
   
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Foodtype getType() {
        return type;
    }

    public void setType(Foodtype type) {
        this.type = type;
    }

}