
public class Equipment {
    private String name;
    private double rentValue;
    private boolean isRented;

    public Equipment(String name, double rentValue) {
        this.name = name;
        this.rentValue = rentValue;
        this.isRented = false;
    }

    public String getName() {
        return name;
    }

    public double getRentValue() {
        return rentValue;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}



