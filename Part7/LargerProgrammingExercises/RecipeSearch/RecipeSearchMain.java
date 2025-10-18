import java.util.Scanner;

public class RecipeSearchMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File to read: ");
        String fileName = scanner.nextLine();

        RecipeSearch recipeSearch = new RecipeSearch(fileName, scanner);

        recipeSearch.listCommands();
        recipeSearch.locateNameAndTime();

        while (true){
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")){
                break;
            }

            else if (command.equals("list")){
                recipeSearch.list();
            }

            else if (command.equals("find name")){
                recipeSearch.findName();
            } else if (command.equals("find cooking time")) {
                recipeSearch.findRecipeByTime();
            } else if (command.equals("find ingredient")) {
                recipeSearch.findByIngredient();
            }
        }
    }
}
