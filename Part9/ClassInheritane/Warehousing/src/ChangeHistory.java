import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory(){
        this.history = new ArrayList<>();
    }

    public void add(double status){
        this.history.add(status);
    }

    public void clear(){
        this.history.clear();
    }

    public double maxValue(){
        if (!history.isEmpty()) {
            return Collections.max(history);
        }
        return 0;
    }

    public double minValue(){
        if (!history.isEmpty()){
            return Collections.min(history);
        }
        return 0;
    }

    public double average(){
        double average = 0;
        for (double d : history){
            average += d;
        }
        return average / this.history.size();
    }

    public String toString(){
        return String.valueOf(history);
    }
}
