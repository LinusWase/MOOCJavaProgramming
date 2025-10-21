public class Engine extends Part{
    private String engineType;

    public Engine(String engineType, String identifier, String desription, String manufacturer) {
        super(identifier, desription, manufacturer);
        this.engineType = engineType;
    }

    public String getEngineType(){
        return engineType;
    }
}
