public class Motorcycle extends Equipment {
    private String bikeType;

    public Motorcycle(String name, double rentValue, String bikeType) {
        super(name, rentValue);
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return bikeType;
    }
}

