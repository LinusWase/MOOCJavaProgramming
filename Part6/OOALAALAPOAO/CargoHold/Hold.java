import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public int totalWeight (){
        int sum = 0;
        for (Suitcase suitcase : suitcases){
            sum += suitcase.totalWeight();
        }
        return sum;
    }

    public void addSuitcase(Suitcase suitcase){
        if (suitcase.totalWeight() + totalWeight() > maximumWeight){
            return;
        }
        suitcases.add(suitcase);
    }

    public void printItems(){
        for (Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }

    public String toString(){
        return this.suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
}
