public class Container {
    private int amount;
    private int maximum;
    private String name;

    public Container(String name){
        this.amount = 0;
        this.maximum = 100;
        this.name = name;
    }

    public void add(int value){
        if (value > 0) {
            this.amount += value;
            this.max();
        }
    }

    public void move(Container first, int value){
        if (first.amount == 0){
            return;
        }
        if (value > 0) {
            if (value > first.amount){
                this.amount += first.amount;
                first.amount = 0;
            } else {
                this.amount += value;
                first.amount -= value;
            }
        }
        this.max();
        this.minimum();
    }

    public void remove(int value){
        if (value > 0){
            this.amount -= value;
        }

        this.minimum();
    }

    public void max(){
        if (this.amount > this.maximum) {
            this.amount = this.maximum;
        }
    }

    public void minimum(){
        if (this.amount < 0) {
            this.amount = 0;
        }
    }

    @Override
    public String toString() {
        return this.name + ": " + this.amount + "/" + this.maximum;
    }
}
