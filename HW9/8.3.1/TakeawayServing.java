public class TakeawayServing implements ServingMethod {
    @Override
    public void prepareCup() {
        System.out.println("Using a paper cup with a lid and a sleeve.");
    }
    @Override
    public int getExtraCost() {
        return 5; // Ціна за стаканчик і пакет
    }
    @Override
    public String getServingType() {
        return "to-go";
    }
}
