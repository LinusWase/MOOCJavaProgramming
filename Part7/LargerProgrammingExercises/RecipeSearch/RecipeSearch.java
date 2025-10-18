import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class RecipeSearch {
    private final String fileName;
    private HashMap<String, Integer> recipe;
    private Scanner scanner;

    public RecipeSearch(String fileName, Scanner scanner) {
        this.fileName = fileName;
        this.recipe = new HashMap<>();
        this.scanner = scanner;
    }

    public void listCommands(){
        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

    public void locateNameAndTime(){
        try (Scanner scanner = new Scanner(Paths.get(this.fileName))){
            String lastRecipe = "";
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()){
                    continue;
                }

                if (Character.isUpperCase(line.charAt(0))){
                    lastRecipe = line;
                } else if (Character.isDigit(line.charAt(0))) {
                    recipe.put(lastRecipe, Integer.valueOf(line));
                }
            }
        } catch (Exception e) {
            System.out.println("Error when reading file: " + e.getMessage());
        }
    }

    public void list(){
        System.out.println("\nRecipes:");
        for (String i : recipe.keySet()){
            this.printLine(i);
        }
    }

    public void findName(){
        System.out.print("Searched word: ");
        String word = this.scanner.nextLine();

        System.out.println("\nRecipes:");

        for (String i : recipe.keySet()){
            if (i.toLowerCase().contains(word)){
                this.printLine(i);
            }
        }
    }

    public void findRecipeByTime() {
        System.out.print("Max cooking time: ");
        int time = Integer.valueOf(scanner.nextLine());
        System.out.println();
        System.out.println("Recipes:");
        for (String i : recipe.keySet()) {
            if (this.recipe.get(i) <= time) {
                this.printLine(i);
            }
        }
    }

    public void printLine(String i){
        System.out.println(i + ", cooking time: " + recipe.get(i));
    }

    public void findByIngredient(){
        System.out.print("Ingredient: ");
        String word = scanner.nextLine();

        System.out.println("\nRecipes:");
        try (Scanner scanner = new Scanner(Paths.get(this.fileName))){
            String lastRecipe = "";
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()){
                    continue;
                }

                if (Character.isUpperCase(line.charAt(0))){
                    lastRecipe = line;
                } else if (line.equals(word)) {
                    printLine(lastRecipe);
                }
            }
        } catch (Exception e) {
            System.out.println("Error when reading file: " + e.getMessage());
        }
    }
}
