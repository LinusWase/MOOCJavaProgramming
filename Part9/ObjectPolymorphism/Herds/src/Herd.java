import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        for (Movable m : list){
            string.append(m.toString()).append('\n');
        }
        return string.toString();
    }

    public void addToHerd(Movable movable){
        this.list.add(movable);
    }


    @Override
    public void move(int dx, int dy) {
        for (Movable m : list){
            m.move(dx, dy);
        }
    }
}
