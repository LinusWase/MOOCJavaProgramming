public class OneItemBox extends Box{
    private int itemInBox;
    private String name;

    public OneItemBox(){
        this.itemInBox = 0;
    }


    @Override
    public void add(Item item) {
        if (itemInBox == 0){
            this.name = item.getName();
            this.itemInBox += 1;
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return item.getName().equals(this.name);
    }
}
