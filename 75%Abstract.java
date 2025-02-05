abstract class Vehicle {
    abstract void start();

    abstract void stop();

    abstract void wheels();

    void fuelType() {
        System.out.println("Petrol");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started");
    }

    @Override
    void stop() {
        System.out.println("Bike stopped");
    }

    @Override
    void wheels() {
        System.out.println("Two wheels");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle myBike = new Bike();
        myBike.start();
        myBike.wheels();
        myBike.stop();
    }
}
