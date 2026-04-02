class CarRental {
    int carId;
    String carType;
    float rent;

    void getCar(int id, String type) {
        carId = id;
        carType = type;

        if (type.equals("Small")) rent = 1000;
        else if (type.equals("Van")) rent = 800;
        else rent = 2500;
    }

    void showCar() {
        System.out.println(carId + " " + carType + " Rent: " + rent);
    }

    public static void main(String[] args) {
        CarRental c = new CarRental();
        c.getCar(1, "SUV");
        c.showCar();
    }
}