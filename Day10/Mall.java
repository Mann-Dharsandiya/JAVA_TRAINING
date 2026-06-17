package Day10;

public class Mall {
    public static void main(String[] args) {

        Bike b1 = new Bike();
        Parking vehicles[] = {
                new Car(),
                b1,
                new Truck(),
                new Car(),
                new Bike(),
                new Car()
        };

        int bike = 0;
        int truck = 0;
        int car = 0;
        int countOfBike = 0;
        int countOfCar = 0;
        int countOfTruck = 0;

        for (Parking v : vehicles) {
            if (v instanceof Car) {
                countOfCar++;
                car = car + v.toll();
            } else if (v instanceof Bike) {
                countOfBike++;
                bike = bike + v.toll();
            } else if (v instanceof Truck) {
                truck = truck + v.toll();
                countOfTruck++;
            }

        }

        System.out.println("Ajj ka total toll " + (bike + car + truck));

        System.out.println("Total Cars " + countOfCar + " and total was " + car);
        System.out.println("Total Bike " + countOfBike + " and total was " + bike);
        System.out.println("Total Trucks " + countOfTruck + " and total was " + truck);

    }
}
