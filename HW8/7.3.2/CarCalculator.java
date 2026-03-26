public class CarCalculator implements VehicleCalculator {
    private Vehicle vehicle;

    @Override
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String calculatePrice() {
        float price = 10000 - (vehicle.getAge() * 500) - (vehicle.getMileage() / 1000);
        price -= (price * vehicle.getDamage());
        return String.valueOf(Math.max(price, 500));
    }
}
