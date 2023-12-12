public abstract class Vehicle {
    String make;
    int year;
    String status;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
        this.status = "stopped";
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getStatus() {
        return status;
    }

    public abstract void start();

    public abstract void stop();

    @Override
    public abstract String toString();
}