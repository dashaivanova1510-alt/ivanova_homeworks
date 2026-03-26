public class Coffee extends Beverage {
    private final int milkVolume;
    private final int waterVolume;

    public Coffee(int sugar, int waterVolume, int milkVolume, ServingMethod servingMethod) {
        super(sugar, servingMethod);
        this.waterVolume = waterVolume;
        this.milkVolume = milkVolume;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing coffee...");
        servingMethod.prepareCup();
        System.out.printf("Add %s ml water, %s ml milk, %s pieces of sugar.%n", 
                          waterVolume, milkVolume, sugar);
    }

    @Override
    public void drink() {
        System.out.println("Drinking coffee " + servingMethod.getServingType() + "!");
    }

    @Override
    public int getBaseCost() {
        return 15 + (milkVolume / 10);
    }
}
