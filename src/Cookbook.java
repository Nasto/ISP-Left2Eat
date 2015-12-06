import java.util.ArrayList;
import java.util.List;
	
/**
 * TODO description
 */
//#if Cookbook
public class Cookbook {

	private List<Recipe> recipes;
	
	public Cookbook(){
		recipes = new ArrayList<>();
		//TODO add predefined recipes
	}

    public List<Recipe> getRecipes() {
        return recipes;
    }

    //#if OwnRecipes
//@    public void addRecipes(Recipe recipes) {
//@        this.recipes.add(recipes);
//@    }
    //#endif
}
//#endif
