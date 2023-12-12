public final class Car extends Vehicle {
    private final int numDoors;

    public Car(String make, int year, int numDoors) {
        super(make, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public void start() {
        if (!status.equals("started")) {
            status = "started";
        }
    }

    @Override
    public void stop() {
        if (!status.equals("stopped")) {
            status = "stopped";
        }
    }

    @Override
    public String toString() {
        return "Car: Make=" + make + ", Year=" + year + ", Status=" + status + ", Number of Doors=" + numDoors;
    }
}
