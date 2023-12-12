public class ManagementSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                new Car("Toyota", 2022, 4),
                new Car("Honda", 2019, 2),
                new Car("Ford", 2020, 5),
                new Motorcycle("Harley Davidson", 2021, "Cruiser"),
                new Motorcycle("Suzuki", 2018, "Sportbike"),
                new Motorcycle("Yamaha", 2023, "Sportbike")
        };

        vehicles[0].start();
        vehicles[1].stop();
        ((Motorcycle) vehicles[3]).setMalfunction();
        vehicles[3].start();

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }
}