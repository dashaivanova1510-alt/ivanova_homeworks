public class InRestaurantServing implements ServingMethod {
    @Override
    public void prepareCup() {
        System.out.println("Using a ceramic cup.");
    }
    @Override
    public int getExtraCost() {
        return 0; 
    }
    @Override
    public String getServingType() {
        return "in the restaurant";
    }
}
