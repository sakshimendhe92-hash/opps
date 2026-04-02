abstract class Ride {
    double distance;

    Ride(double d) {
        distance = d;
    }

    abstract double calculateFare();
}

class BikeRide extends Ride {
    BikeRide(double d) {
        super(d);
    }

    double calculateFare() {
        return distance * 5;
    }
}

class AutoRide extends Ride {
    AutoRide(double d) {
        super(d);
    }

    double calculateFare() {
        return distance * 8;
    }
}

class CarRide extends Ride {
    CarRide(double d) {
        super(d);
    }

    double calculateFare() {
        return distance * 12;
    }
}

class TestRide {
    public static void main(String[] args) {
        Ride r;

        r = new BikeRide(10);
        System.out.println("Bike Fare: " + r.calculateFare());

        r = new AutoRide(10);
        System.out.println("Auto Fare: " + r.calculateFare());

        r = new CarRide(10);
        System.out.println("Car Fare: " + r.calculateFare());
    }
}
