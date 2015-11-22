/**
 * Main class to start the program and do the initialization.
 * Preprocessor statements are made here and in the corresponding classes.
 * --> Here: 	To avoid unnecessary Objects and calls.
 * --> Classes:	To get rid of unused Code.
 */
public class Main {
	public static void main(String[] args) {
		Left2eat left2eat = new Left2eat();
		
		//#if Cookbook
		left2eat.cookbook = new Cookbook();
		System.out.println("Cookbook added!");
		//#endif
		
		//#if ShoppingList
		left2eat.shoppingList = new ShoppingList();
		System.out.println("ShoppingList added!");
		//#endif
		
		//#if Reminder
		Reminder rem = new Reminder();
		left2eat.reminder = rem;
		//#endif
	}
	
}