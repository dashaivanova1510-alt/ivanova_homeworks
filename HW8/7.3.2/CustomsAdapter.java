public class CustomsAdapter implements Customs {
    private final VehicleCalculator americanCalculator;
    private final float USD_TO_UAH = 40.0f; 

    public CustomsAdapter(VehicleCalculator americanCalculator) {
        this.americanCalculator = americanCalculator;
    }

    @Override
    public float vehiclePrice(Auto auto) {
        float damageValue = auto.damaged ? 0.5f : 0.0f; 
        Vehicle vehicle = new Vehicle(auto.model, auto.age, damageValue, auto.mileage);

        americanCalculator.setVehicle(vehicle);

        String priceInUsdStr = americanCalculator.calculatePrice();
        float priceInUsd = Float.parseFloat(priceInUsdStr);

        return priceInUsd * USD_TO_UAH;
    }

    @Override
    public float tax(Auto auto) {
        return vehiclePrice(auto) * 0.20f;
    }
}
