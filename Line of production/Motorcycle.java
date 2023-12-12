public final class Motorcycle extends Vehicle {
    private final String type;

    public Motorcycle(String make, int year, String type) {
        super(make, year);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setMalfunction() {
        status = "malfunction";
    }

    @Override
    public void start() {
        if (!status.equals("started") && !status.equals("malfunction")) {
            status = "started";
        }
    }

    @Override
    public void stop() {
        if (!status.equals("stopped") && !status.equals("malfunction")) {
            status = "stopped";
        }
    }

    @Override
    public String toString() {
        return "Motorcycle: Make=" + make + ", Year=" + year + ", Status=" + status + ", Type=" + type;
    }
}


