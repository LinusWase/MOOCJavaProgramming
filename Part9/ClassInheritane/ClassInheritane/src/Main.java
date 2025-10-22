import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine("combustion", "hz", "volkswagen", "VW GOLF 1L 86-91");
        System.out.println(engine.getEngineType());
        System.out.println(engine.getManufacturer());

        Superclass superclass = new Superclass();
        Subclass subclass = new Subclass();

        System.out.println(superclass);
        System.out.println(subclass);

        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(4,8));
        points.add(new ColorPoint(1,1,"green"));
        points.add(new ColorPoint(2,5,"blue"));
        points.add(new Point3D(5,2,8));
        points.add(new Point(0,0));

        for (Point p : points){
            System.out.println(p);
        }

        UserInterface userInterface = new UserInterface(new Scanner(System.in));
        userInterface.addOperation(new PlusOperation());

        userInterface.start();
    }
}
