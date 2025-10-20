import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> whatDoIOwn;

    public IOU(){
        this.whatDoIOwn = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        whatDoIOwn.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        if (whatDoIOwn.containsKey(toWhom)){
            return whatDoIOwn.get(toWhom);
        }
        return 0;
        //Better way:  return debt.getOrDefault(toWhom, 0.0);
    }
}
