import java.util.Scanner;

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
//@		left2eat.shoppingList = new ShoppingList();
//@		System.out.println("ShoppingList added!");
		//#endif
		
		//#if Reminder
		Reminder rem = new Reminder();
		left2eat.reminder = rem;
		//#endif
		
		System.out.println("---------------------\n"
				+ "Usage:\n"
				+ "add [name] [type] \t adds a food object to the frigde.\n"
				+ "Possible types:\n"
				+ "\t 0: \t none,\n"
				+ "\t 1: \t meat,\n"
				+ "\t 2: \t fruit,\n"
				+ "\t 3: \t vegetable,\n"
				+ "\t 4: \t drink\n"
				+ "quit \t exits the program.");
		
		Scanner user_input = new Scanner(System.in);
		
		String user_command;
		
		while (true) {
			System.out.print("Input: ");
			user_command = user_input.nextLine();
			if (user_command.startsWith("add")) {
				String[] subCmds = user_command.split(" ");

				left2eat.fridge.addContent(new Food(subCmds[1], Integer.valueOf(subCmds[2])));
				System.out.println("Content added!");
			} else if(user_command.startsWith("quit")){
				System.out.println("Closing program...");
				user_input.close();
				return;
			}
			
			
		}
		
	}
	
}
