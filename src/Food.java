/**
 * TODO description
 */
public class Food {
    
	private String label;
    private Foodtype type;

    // da Private, brauchen wir auch getter und setter
    
    public Food(String label, int type){
    	this.label = label;
    	this.type = Foodtype.values()[type];
    }
   
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