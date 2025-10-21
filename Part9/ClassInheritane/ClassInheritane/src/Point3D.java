public class Point3D extends Point{
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    protected String location(){
        return super.location() + ", " + z;
    }

    public int manhattanDistanceFromOrigin(){
        return super.manhattanDistanceFromOrigin() + Math.abs(z);
    }
}
